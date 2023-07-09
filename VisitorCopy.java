import ast.*;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import util.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class JasminVisitor extends Visitor {

   private STGroup groupTemplate;
   private ST type, stmt, expr;
   private List<ST> funcs, params;

   private String fileName;

   TyEnv<LocalEnv<Pair<SType, Integer>>> env;
   LocalEnv<Pair<SType, Integer>> local;

   private int label = 0;

   public JasminVisitor(String fileName, TyEnv<LocalEnv<Pair<SType, Integer>>> env) {
      groupTemplate = new STGroupFile("./template/jasmin.stg");
      this.fileName = fileName;
      this.env = env;
   }

   public void visit(Program p) {
      ST template = groupTemplate.getInstanceOf("program");

      template.add("name", fileName);
      funcs = new ArrayList<ST>();
      for (Func f : p.getFuncs()) {
         f.accept(this);
      }
      template.add("funcs", funcs);

      System.out.println(template.render());

   }

   public void visit(Add e) {
      ST aux = null;
      if (e.getType() instanceof STyInt) {
         aux = groupTemplate.getInstanceOf("iadd");
      }
      e.getLeft().accept(this);
      aux.add("left_expr", expr);
      e.getRight().accept(this);
      aux.add("right_expr", expr);
      expr = aux;
   }

   public void visit(Sub e) {
      ST aux = null;
      if (e.getType() instanceof STyInt) {
         aux = groupTemplate.getInstanceOf("isub");
      }
      e.getLeft().accept(this);
      aux.add("left_expr", expr);
      e.getRight().accept(this);
      aux.add("right_expr", expr);
      expr = aux;
   }

   public void visit(Mul e) {
      ST aux = null;
      if (e.getType() instanceof STyInt) {
         aux = groupTemplate.getInstanceOf("imul");
      }
      e.getLeft().accept(this);
      aux.add("left_expr", expr);
      e.getRight().accept(this);
      aux.add("right_expr", expr);
      expr = aux;
   }

   public void visit(Div e) {
      ST aux = null;
      if (e.getType() instanceof STyInt) {
         aux = groupTemplate.getInstanceOf("idiv");
      }
      e.getLeft().accept(this);
      aux.add("left_expr", expr);
      e.getRight().accept(this);
      aux.add("right_expr", expr);
      expr = aux;
   }

   public void visit(Mod e) {
      ST aux = null;
      if (e.getType() instanceof STyInt) {
         aux = groupTemplate.getInstanceOf("imod");
      }
      e.getLeft().accept(this);
      aux.add("left_expr", expr);
      e.getRight().accept(this);
      aux.add("right_expr", expr);
      expr = aux;
   }

   public void visit(And e) {
      ST aux = groupTemplate.getInstanceOf("and_expr");
      e.getLeft().accept(this);
      aux.add("left_expr", expr);
      e.getRight().accept(this);
      aux.add("right_expr", expr);
      expr = aux;
   }

   public void visit(Lt e) {
      ST aux = groupTemplate.getInstanceOf("ilt_expr"); // assumi comparação de inteiros
      e.getLeft().accept(this);
      aux.add("left_expr", expr);
      e.getRight().accept(this);
      aux.add("right_expr", expr);
      aux.add("num", label++);
      expr = aux;
   }

   public void visit(Eq e) {
      ST aux = null;
      if (e.getType() instanceof STyInt)
         aux = groupTemplate.getInstanceOf("equals_expr");
      e.getLeft().accept(this);
      aux.add("left_expr", expr);
      e.getRight().accept(this);
      aux.add("right_expr", expr);
      aux.add("num", label++);
      expr = aux;

   }

   public void visit(Not e) {
      ST aux = groupTemplate.getInstanceOf("not_expr");
      e.getExpr().accept(this);
      aux.add("expr", expr);
      expr = aux;
   }

   public void visit(True e) {
      expr = groupTemplate.getInstanceOf("boolean_true");
      expr.add("value", true);
   }

   public void visit(False e) {
      expr = groupTemplate.getInstanceOf("boolean_false");
      expr.add("value", false);
   }

   public void visit(NInt e) {
      expr = groupTemplate.getInstanceOf("int_expr");
      expr.add("value", e.getValue());
   }

   public void visit(NFloat e) {
      expr = groupTemplate.getInstanceOf("float_expr");
      expr.add("value", e.getValue());
   }

   public void visit(Var e) {
      Pair<SType, Integer> pair = local.get(e.getName());
      ST access = null;
      SType t = pair.first();
      if (t instanceof STyInt) {
         access = groupTemplate.getInstanceOf("iaccess");
      } else if (t instanceof STyArr) {
         if (((STyArr) t).getArg() instanceof STyInt) {
            if (e.getIdx().length > 0)
               access = groupTemplate.getInstanceOf("iaaccess");
            else
               access = groupTemplate.getInstanceOf("iaload");
         }
         for (Expr exp : e.getIdx()) {
            exp.accept(this); // funciona somente para vetor unidimensional
            access.add("expr", expr);
         }
      }
      // System.out.println(e.getName() + " - Tipo: " + t);
      access.add("num", pair.second());
      expr = access;
   }

   public void visit(Call e) {
      ST aux = groupTemplate.getInstanceOf("call");
      aux.add("class", fileName);
      aux.add("name", e.getName());

      SType[] fun_type = ((STyFun) env.get(e.getName()).getFuncType()).getTypes();
      processSType(fun_type[fun_type.length - 1]);
      aux.add("return", type);
      for (int i = 0; i < fun_type.length - 1; ++i) {
         processSType(fun_type[i]);
         aux.add("type", type);
      }
      /*
       * Expr[] args = e.getArgs(); // Esse código empilha os parâmetros ao inverso,
       * mas não funcionou
       * for(int i = args.length - 1; i >= 0; --i) {
       * args[i].accept(this);
       * aux.add("args", expr);
       * }
       */
      for (Expr exp : e.getArgs()) {
         exp.accept(this);
         aux.add("args", expr);
      }

      expr = aux;
   }

   public void visit(Attr e) {
      Pair<SType, Integer> pair = local.get(e.getID().getName());
      SType t = pair.first();
      if (t instanceof STyInt)
         stmt = groupTemplate.getInstanceOf("istore");
      else if (t instanceof STyArr) {
         if (((STyArr) t).getArg() instanceof STyInt)
            stmt = groupTemplate.getInstanceOf("iastore");
         for (Expr exp : e.getID().getIdx()) { // só funciona se for vetor unidimensional
            exp.accept(this);
         }
         stmt.add("index", expr);
      }
      stmt.add("num", pair.second());
      e.getExp().accept(this);
      stmt.add("expr", expr);
   }

   public void visit(If e) {
      ST aux = groupTemplate.getInstanceOf("if");
      aux.add("num", label++);
      e.getTeste().accept(this);
      aux.add("expr", expr);
      e.getThen().accept(this);
      aux.add("thn", stmt);
      Node n = e.getElse();
      if (n != null) {
         n.accept(this);
         aux.add("els", stmt);
      }
      stmt = aux;
   }

   public void visit(While e) {
      ST aux = groupTemplate.getInstanceOf("while");
      aux.add("num", label++);
      e.getTeste().accept(this);
      aux.add("expr", expr);
      e.getBody().accept(this);
      aux.add("stmt", stmt);
      stmt = aux;
   }

   public void visit(Print e) {
      e.getExpr().accept(this);
      SType t = e.getExpr().getType();
      if (t instanceof STyInt) {
         stmt = groupTemplate.getInstanceOf("iprint");
      }
      stmt.add("expr", expr);
   }

   public void visit(StmtList e) {
      ST aux = groupTemplate.getInstanceOf("stmt_list");
      e.getCmd1().accept(this);
      aux.add("stmt1", stmt);
      Node s = e.getCmd2();
      if (s != null) {
         s.accept(this);
         aux.add("stmt2", stmt);
      }
      stmt = aux;
   }

   public void visit(Func f) {

      ST fun = groupTemplate.getInstanceOf("func");
      fun.add("name", f.getID());

      // Variáveis locais da função com informação de tipo
      // * Os parâmetros
      // * Variáveis locais
      local = env.get(f.getID());

      fun.add("decls", local.getKeys().size()); // número de váriaveis locais, incluíndo os parâmetros
      fun.add("stack", 10); // tamanho máximo da pilha. Coloquei 10, mas tem que calcular baseado no tamanho
                            // das subexpressões

      f.getTipo().accept(this);
      fun.add("return", type);

      params = new ArrayList<ST>();
      for (Param p : f.getParams()) {
         p.accept(this);
      }
      fun.add("params", params);

      f.getBody().accept(this);
      fun.add("stmt", stmt);

      funcs.add(fun);

   }

   public void visit(Inst e) {
      // só funciona com vetores unidimensionais de inteiros
      stmt = groupTemplate.getInstanceOf("iarray");
      e.getSize().accept(this);
      stmt.add("expr", expr);
      stmt.add("num", local.get(e.getID().getName()).second());
   }

   public void visit(Return e) {
      e.getExpr().accept(this);
      SType t = e.getExpr().getType();
      if (t instanceof STyInt) {
         stmt = groupTemplate.getInstanceOf("ireturn");
      }
      stmt.add("expr", expr);
   }

   public void visit(Param e) {
      e.getTipo().accept(this);
      params.add(type);
   }

   public void visit(TyInt t) {
      type = groupTemplate.getInstanceOf("int_type");
   }

   public void visit(TyFloat t) {
      type = groupTemplate.getInstanceOf("float_type");
   }

   public void visit(TyBool t) {
      type = groupTemplate.getInstanceOf("boolean_type");
   }

   public void visit(TyArr t) {
      ST aux = groupTemplate.getInstanceOf("array_type");
      t.getTyArg().accept(this);
      aux.add("type", type);
      type = aux;
   }

   ////////////// Métodos ///////////
   private void processSType(SType t) {

      if (t instanceof STyInt)
         type = groupTemplate.getInstanceOf("int_type");
      else if (t instanceof STyBool)
         type = groupTemplate.getInstanceOf("boolean_type");
      else if (t instanceof STyFloat)
         type = groupTemplate.getInstanceOf("float_type");
      else if (t instanceof STyArr) {
         ST aux = groupTemplate.getInstanceOf("array_type");
         processSType(((STyArr) t).getArg());
         aux.add("type", type);
         type = aux;
      }

   }

}

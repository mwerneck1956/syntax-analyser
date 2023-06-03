package com.compiler.visitors;

import com.compiler.ast.*;

public interface Visitor {
   public abstract void visit(Prog prog);

   public abstract void visit(Data data);

   public abstract void visit(Add add);

   public abstract void visit(Mult mult);

   public abstract void visit(Div div);

   public abstract void visit(Print print);

   public abstract void visit(Read read);

   public abstract void visit(Attribution attr);

   public abstract void visit(BasicType attr);

   public abstract void visit(BinOP binOp);

   public abstract void visit(CmdList cmdList);

   public abstract void visit(Function function);

   public abstract void visit(FunctionCall functionCall);

   public abstract void visit(ID id);

   public abstract void visit(If ifExpr);

   public abstract void visit(Iterate iterate);

   public abstract void visit(LiteralChar literal);

   public abstract void visit(LiteralFalse literal);

   public abstract void visit(LiteralFloat literal);

   public abstract void visit(LiteralInt literal);

   public abstract void visit(LiteralNull literal);

   public abstract void visit(LiteralTrue literal);

   public abstract void visit(StmtList stmtList);

   public abstract void visit(Sub sub);

   public abstract void visit(LessThan lessThan);

   public abstract void visit(GreatherThan lessThan);

   public abstract void visit(Param param);

}

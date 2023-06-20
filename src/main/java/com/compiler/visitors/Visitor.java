/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

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

    public abstract void visit(Sub sub);

    public abstract void visit(Mod mod);

    public abstract void visit(LessThan lessThan);

    public abstract void visit(GreatherThan lessThan);

    public abstract void visit(Not not);

    public abstract void visit(Equal equal);

    public abstract void visit(Diff diff);

    public abstract void visit(Param param);

    public abstract void visit(Return ret);

    public abstract void visit(ParenthesisExpression parenthesisExpression);

    public abstract void visit(And and);

    public abstract void visit(AttributeAccess attributeAccess);

    public abstract void visit(NewData newData);

    public abstract void visit(ArrayPositionAccess arrayPositionAccess);

    public abstract void visit(TypeInt typeInt);

    public abstract void visit(TypeFloat typeFloat);

    public abstract void visit(TypeBool typeBool);

    public abstract void visit(TypeChar typeChar);

    public abstract void visit(TypeCustom customType);

}

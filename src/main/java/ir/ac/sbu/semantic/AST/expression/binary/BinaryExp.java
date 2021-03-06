package ir.ac.sbu.semantic.AST.expression.binary;

import ir.ac.sbu.semantic.AST.expression.Expression;
import org.objectweb.asm.Type;


abstract public class BinaryExp extends Expression {
    protected Expression firstop;
    protected Expression secondop;

    public BinaryExp(Expression firstop, Expression secondop) {
        this.firstop = firstop;
        this.secondop = secondop;
    }
}

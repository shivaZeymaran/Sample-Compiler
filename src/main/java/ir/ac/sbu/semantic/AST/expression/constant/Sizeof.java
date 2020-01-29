package ir.ac.sbu.semantic.AST.expression.constant;

//import ir.ac.sbu.semantic.symbolTable.FelanTemp;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public class Sizeof extends Constant {

    private Integer value;

    public Sizeof(String baseType){
       // value = FelanTemp.getSize(baseType);
        type = Type.INT_TYPE;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void codegen(MethodVisitor mv, ClassWriter cw) {
        IntegerConst.storeIntValue(mv,value);
    }
}
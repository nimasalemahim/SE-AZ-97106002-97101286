package codegenerator;

public class Address {
    private int num;
    private TypeAddress Type;
    private varType varType;

    public int getNum() {
        return num;
    }

    public TypeAddress getType() {
        return Type;
    }

    public codegenerator.varType getVarType() {
        return varType;
    }

    public Address(int num, varType varType, TypeAddress Type) {
        this.num = num;
        this.Type = Type;
        this.varType = varType;
    }

    public Address(int num, varType varType) {
        this.num = num;
        this.Type = TypeAddress.Direct;
        this.varType = varType;
    }

    public String toString() {
        return Type.label + num;
    }
}

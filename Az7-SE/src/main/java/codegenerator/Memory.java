package codegenerator;

import java.util.ArrayList;
import java.util.List;

public class Memory {
    private static List<_3AddressCode> codeBlock;
    private static int lastTempIndex;
    private static int lastDataAddress;
    private final int dataSize = 4;
    private final int tempSize = 4;

    public static Memory create() {
        codeBlock = new ArrayList<_3AddressCode>();
        lastTempIndex = 500;
        lastDataAddress = 200;
        return new Memory();
    }

    public void addLastTemp() {
        lastTempIndex += tempSize;
    }

    public int getLastTemp() {
        return lastTempIndex - tempSize;
    }

    public void addLastAddress() {
        lastDataAddress += dataSize;
    }

    public int getLastAddress() {
        return lastDataAddress - dataSize;
    }

    public int getTemp() {
        addLastTemp();
        return getLastTemp();
    }

    public int getDateAddress() {
        addLastAddress();
        return getLastAddress();
    }

    public int saveMemory() {
        codeBlock.add(new _3AddressCode());
        return codeBlock.size() - 1;
    }

    public void add3AddressCode(Operation op, Address opr1, Address opr2, Address opr3) {
        codeBlock.add(new _3AddressCode(op, opr1, opr2, opr3));
    }

    public void add3AddressCode(int i, Operation op, Address opr1, Address opr2, Address opr3) {
        codeBlock.remove(i);
        codeBlock.add(i, new _3AddressCode(op, opr1, opr2, opr3));
    }

    public int getCurrentCodeBlockAddress() {
        return codeBlock.size();
    }

    public void pintCodeBlock() {
        System.out.println("Code Block");
        for (int i = 0; i < codeBlock.size(); i++) {
            System.out.println(i + " : " + codeBlock.get(i).toString());
        }
    }
}

class _3AddressCode {
    public Operation operation;
    public Address Operand1;
    public Address Operand2;
    public Address Operand3;

    public _3AddressCode() {

    }

    public _3AddressCode(Operation op, Address opr1, Address opr2, Address opr3) {
        operation = op;
        Operand1 = opr1;
        Operand2 = opr2;
        Operand3 = opr3;
    }

    public String toString() {
        if (operation == null) {
            return "";
        }
        StringBuffer res = new StringBuffer("(");
        res.append(operation.toString()).append(",");
        if (Operand1 != null) {
            res.append(Operand1.toString());
        }

        res.append(",");
        if (Operand2 != null) {
            res.append(Operand2.toString());
        }

        res.append(",");
        if (Operand3 != null) {
            res.append(Operand3.toString());
        }

        res.append(")");

        return res.toString();
    }
}

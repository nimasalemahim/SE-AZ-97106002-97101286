package codegenerator;

import errorhandler.ErrorHandler;

import java.util.Stack;

abstract class Compare {
    abstract void compare(Memory memory, Stack<Address> ss);
}

class Equal extends Compare {

    @Override
    void compare(Memory memory, Stack<Address> ss) {
        Address temp = new Address(memory.getTemp(), varType.Bool);
        Address s2 = ss.pop();
        Address s1 = ss.pop();
        if (s1.getVarType() != s2.getVarType()) {
            ErrorHandler.printError("The type of operands in equal operator is different");
        }
        memory.add3AddressCode(Operation.EQ, s1, s2, temp);
        ss.push(temp);
    }
}

class Less extends Compare {

    @Override
    void compare(Memory memory, Stack<Address> ss) {
        Address temp = new Address(memory.getTemp(), varType.Bool);
        Address s2 = ss.pop();
        Address s1 = ss.pop();
        if (s1.getVarType() != varType.Int || s2.getVarType() != varType.Int) {
            ErrorHandler.printError("The type of operands in less than operator is different");
        }
        memory.add3AddressCode(Operation.LT, s1, s2, temp);
        ss.push(temp);
    }
}

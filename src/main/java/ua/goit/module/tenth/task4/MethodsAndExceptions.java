package ua.goit.module.tenth.task4;

import ua.goit.module.tenth.task2.MyException;

public class MethodsAndExceptions {
    public void f() throws MyException2{
        try{
            g();
        } catch (MyException e){
            throw new MyException2("second exception class");
        }
    }
    public void g() throws MyException {
        throw new MyException("first exception class");
    }
}

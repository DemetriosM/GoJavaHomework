package ua.goit.module.tenth.task4;

import ua.goit.module.tenth.task2.MyException;

public class Main {
    public static void main(String[] args) {
        MethodsAndExceptions test = new MethodsAndExceptions();
        try{
            //test.g();
            test.f();
        } catch (MyException e){
            System.out.println(e.getMyMessage());
        }
    }
}

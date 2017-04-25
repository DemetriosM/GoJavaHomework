package ua.goit.module.tenth.task5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try{
            throwException();
        } catch(FirstException | SecondException | ThirdException e ){
            System.out.println(e);
        }
    }

    public static void throwException() throws FirstException, SecondException, ThirdException{
        int numberOfException = new Random().nextInt(3);
        switch (numberOfException){
            case 0: throw new FirstException();
            case 1: throw new SecondException();
            case 2: throw new ThirdException();
        }
    }
}

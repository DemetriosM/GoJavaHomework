package ua.goit.module.tenth.task2;

public class Main {
    public static void main(String[] args) {
        try{
            throw new MyException("My Exception");
        } catch (MyException e){
            System.out.println(e.getMyMessage());
        }
    }
}

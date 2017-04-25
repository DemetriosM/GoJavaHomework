package ua.goit.module.tenth.task2;

public class MyException extends Exception {
    private String myMessage;

    public MyException(String message){
        myMessage = message;
    }

    public String getMyMessage() {
        return myMessage;
    }
}

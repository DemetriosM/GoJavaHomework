package ua.goit.module.third.task2;

public class TaskTwoMain {
    public static void main(String[] args) {
        Adder calculations = new Adder();
        int a = 7, b = 6;
        System.out.printf("a = %d, b = %d\n", a, b);
        System.out.printf("a + b = %d\n", calculations.add(a, b));
        System.out.printf("a >= b - %b", calculations.check(a, b));
    }
}

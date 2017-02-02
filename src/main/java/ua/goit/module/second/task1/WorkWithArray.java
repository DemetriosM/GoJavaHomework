package ua.goit.module.second.task1;

public class WorkWithArray {
    public static void main(String[] args) {

        int[] arrayInt = {-10, 2, 21, 0, 6, -7, 42, 3, -11, 15};
        double[] arrayDouble = {-10.2, 2.3, 21.5, 0.1, 6.7, -7.45, 42.24, 3.44, -11.05, 15.77};

        WorkWithArray calc = new WorkWithArray();
        calc.sum(arrayInt);
        calc.sum(arrayDouble);
        calc.max(arrayInt);
        calc.max(arrayDouble);
        calc.min(arrayInt);
        calc.min(arrayDouble);
        calc.maxPositive(arrayInt);
        calc.maxPositive(arrayDouble);
        calc.multiplication(arrayInt);
        calc.multiplication(arrayDouble);
        calc.modulus(arrayInt);
        calc.modulus(arrayDouble);
        calc.secondLargest(arrayInt);
        calc.secondLargest(arrayDouble);
    }

// sum
    public void sum(int array[]){
        int sum=array[0];
        for (int i=1; i<array.length; i++){
            sum += array[i];
        }
        System.out.println("Сумма элементов массива целых чисел = " + sum);
    }

    public void sum(double array[]){
        double sum=array[0];
        for (int i=1; i<array.length; i++){
            sum += array[i];
        }
        System.out.println("Сумма элементов массива десятичных чисел = " + sum);
    }

//min/max
    public void min(int array[]){
        int min=array[0];
        for (int i=1; i<array.length; i++){
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент массива целых чисел = " + min);
    }

    public void min(double array[]){
        double min=array[0];
        for (int i=1; i<array.length; i++){
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент массива десятичных чисел = " + min);
    }

    public void max(int array[]){
        int max=array[0];
        for (int i=1; i<array.length; i++){
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент массива целых чисел = " + max);
    }

    public void max(double array[]){
        double max=array[0];
        for (int i=1; i<array.length; i++){
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент массива десятичных чисел = " + max);
    }

//maxPositive
    public void maxPositive(int array[]){
        int maxPositive = 0;
        for (int i=0; i<array.length; i++){
            if (maxPositive < array[i]) {
                maxPositive = array[i];
            }
        }
        if (maxPositive > 0){
            System.out.println("Максимальный из положительных элементов массива целых чисел = " + maxPositive);
        } else {
            System.out.println("В масиве целых чисел положительных элементов нет.");
        }
    }

    public void maxPositive(double array[]){
        double maxPositive = 0;
        for (int i=0; i<array.length; i++){
            if (maxPositive < array[i]) {
                maxPositive = array[i];
            }
        }
        if (maxPositive > 0){
            System.out.println("Максимальный из положительных элементов массива десятичных чисел = " + maxPositive);
        } else {
            System.out.println("В масиве десятичных чисел положительных элементов нет.");
        }
    }

//multiplication
    public void multiplication(int array[]){
        long multiple = 1;
        for (int i=0; i<array.length; i++){
            multiple *= array[i];
        }
        System.out.println("Произведение элементов массива целых чисел = " + multiple);
    }

    public void multiplication(double array[]){
        double multiple = 1;
        for (int i=0; i<array.length; i++){
            multiple *= array[i];
        }
        System.out.println("Произведение элементов массива десятичных чисел = " + multiple);
    }

//modulus
    public void modulus(int array[]){
        int firstItem = (array[0]>0) ? array[0] : (array[0] *= -1);
        int lastItem = (array[array.length-1]>0) ? array[array.length-1] : (array[array.length-1] *= -1);
        System.out.println("Модуль первого элемента массива целых чисел = " + firstItem);
        System.out.println("Модуль последнего элемента массива целых чисел = " + lastItem);
    }

    public void modulus(double array[]){
        double firstItem = (array[0]>0) ? array[0] : (array[0] *= -1);
        double lastItem = (array[array.length-1]>0) ? array[array.length-1] : (array[array.length-1] *= -1);
        System.out.println("Модуль первого элемента массива десятичных чисел = " + firstItem);
        System.out.println("Модуль последнего элемента массива десятичных чисел = " + lastItem);
    }

//secondLargest
    public void secondLargest(int array[]){
        int max = array[0], secondLargest = array[0];
        for (int i=1; i<array.length; i++){
            if (max < array[i]) {
                secondLargest = max;
                max = array[i];
            } else if (secondLargest < array[i]){
                secondLargest = array[i];
            }
        }
        System.out.println("Второй максимальный элемент массива целых чисел = " + secondLargest);
    }

    public void secondLargest(double array[]){
        double max = array[0], secondLargest = array[0];
        for (int i=1; i<array.length; i++){
            if (max < array[i]) {
                secondLargest = max;
                max = array[i];
            } else if (secondLargest < array[i]){
                secondLargest = array[i];
            }
        }
        System.out.println("Второй максимальный элемент массива целых чисел = " + secondLargest);
    }
}

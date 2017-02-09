package ua.goit.module.second.task1;

import java.util.Arrays;
import java.util.Random;

public class ArrayFillsAndCalculations {

    private static Random randomGenerator = new Random();
    private int[] arrayCloneInt;
    private double[] arrayCloneDouble;

    public int[] fillArray(int length, int maxPositiveValueInArray) {
        int[] randomIntArray = new int[length];
        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = getRandomValue(Math.abs(maxPositiveValueInArray));
        }
        arrayCloneInt = randomIntArray.clone();
        bubbleSort(arrayCloneInt);
        return randomIntArray;
    }

    public double[] fillArray(int length, double maxPositiveValueInArray){
        double[] randomDoubleArray = new double[length];
        for (int i = 0; i < randomDoubleArray.length; i++) {
            randomDoubleArray[i] = getRandomValue(Math.abs(maxPositiveValueInArray));
        }
        arrayCloneDouble = randomDoubleArray.clone();
        bubbleSort(arrayCloneDouble);
        return randomDoubleArray;
    }

    private static int getRandomValue(int maxPositiveValueInArray) {
        int randomPositiveInt = randomGenerator.nextInt(maxPositiveValueInArray);
        int randomValue = randomGenerator.nextBoolean() ? randomPositiveInt : -1 * randomPositiveInt;
        return randomValue;
    }

    private static double getRandomValue(double maxPositiveValueInArray) {
        double randomPositiveDouble, randomValue;
        do{
            randomPositiveDouble = randomGenerator.nextInt((int)Math.floor(maxPositiveValueInArray)) + randomGenerator.nextDouble();
            randomValue = randomGenerator.nextBoolean() ? randomPositiveDouble : -1 * randomPositiveDouble;
        }while (Math.abs(randomValue) > maxPositiveValueInArray);
        return randomValue;
    }

    private static void bubbleSort(int[] arr) {
        boolean flag;
        int temp;
        do {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        } while (flag);
    }

    private static void bubbleSort(double[] arr) {
        boolean flag;
        double temp;
        do {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        } while (flag);
    }

    // sum
    public int sum(int array[]){
        int sum=array[0];
        for (int i=1; i<array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public double sum(double array[]){
        double sum=array[0];
        for (int i=1; i<array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    //min/max
    public int min(int array[]){
        return arrayCloneInt[0];
    }

    public double min(double array[]){
        return arrayCloneDouble[0];
    }

    public int max(int array[]){
        return arrayCloneInt[array.length - 1];
    }

    public double max(double array[]){
        return arrayCloneDouble[array.length - 1];
    }

    //maxPositive
    public int maxPositive(int array[]){
        int maxValue = arrayCloneInt[array.length - 1];
        return (maxValue>0) ? maxValue : 0;
    }

    public double maxPositive(double array[]){
        double maxValue = arrayCloneDouble[array.length - 1];
        return (maxValue>0) ? maxValue : 0;
    }

    //multiplication
    public long multiplication(int array[]){
        long multiple = 1;
        for (int i=0; i<array.length; i++){
            multiple *= array[i];
        }
        return multiple;
    }

    public double multiplication(double array[]){
        double multiple = 1;
        for (int i=0; i<array.length; i++){
            multiple *= array[i];
        }
        return multiple;
    }

    //modulus
    public int[] modulus(int array[]){
        int modules[] = new int[2];
        modules[0] = Math.abs(array[0]);
        modules[1] = Math.abs(array[array.length-1]);
        return modules;
    }

    public double[] modulus(double array[]){
        double modules[] = new double[2];
        modules[0] = Math.abs(array[0]);
        modules[1] = Math.abs(array[array.length-1]);
        return modules;
    }

    //secondLargest
    public int secondLargest(int array[]){
        return arrayCloneInt[array.length - 2];
    }

    public double secondLargest(double array[]){
        return arrayCloneDouble[array.length - 2];
    }
}

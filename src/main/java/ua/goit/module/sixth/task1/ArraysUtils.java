package ua.goit.module.sixth.task1;

import java.util.Arrays;
import java.util.Random;

public final class ArraysUtils {

    private static Random randomGenerator = new Random();
    private static int[] cloneOfIntegerArray;

    private ArraysUtils(){}

    public static int[] fillIntegerArray(int length, int maxPositiveValueInArray) {
        int[] randomIntArray = new int[length];
        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = getRandomValue(Math.abs(maxPositiveValueInArray));
        }
        return randomIntArray;
    }

    private static int getRandomValue(int maxPositiveValueInArray) {
        int randomPositiveInt = randomGenerator.nextInt(maxPositiveValueInArray);
        int randomValue = randomGenerator.nextBoolean() ? randomPositiveInt : -1 * randomPositiveInt;
        return randomValue;
    }

    private static int[] cloneAndSortArray(int[] array) {
        cloneOfIntegerArray = array.clone();
        boolean flag;
        int temp;
        do {
            flag = false;
            for (int i = 0; i < cloneOfIntegerArray.length - 1; i++) {
                if (cloneOfIntegerArray[i] > cloneOfIntegerArray[i + 1]) {
                    temp = cloneOfIntegerArray[i];
                    cloneOfIntegerArray[i] = cloneOfIntegerArray[i + 1];
                    cloneOfIntegerArray[i + 1] = temp;
                    flag = true;
                }
            }
        } while (flag);
        return cloneOfIntegerArray;
    }

    public static int sum(int array[]){
        int sum=array[0];
        for (int i=1; i<array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static int min(int array[]){
        return cloneAndSortArray(array)[0];
    }

    public static int max(int array[]){
        return cloneAndSortArray(array)[array.length - 1];
    }

    public static int maxPositive(int array[]){
        int maxValue = cloneAndSortArray(array)[array.length - 1];
        return (maxValue>0) ? maxValue : 0;
    }

    public static long multiplication(int array[]){
        long multiple = 1;
        for (int i=0; i<array.length; i++){
            multiple *= array[i];
        }
        return multiple;
    }

    public static int[] modulus(int array[]){
        int modules[] = new int[2];
        modules[0] = Math.abs(array[0]);
        modules[1] = Math.abs(array[array.length-1]);
        return modules;
    }

    public static int secondLargest(int array[]){
        return (array.length > 1) ? cloneAndSortArray(array)[array.length - 2] : array[0];
    }

    public static int[] reverse(int[] array){
        int temp;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }

    public static int[] findEvenElements(int[] array){
        int[] arrayOfEvenNumbers = new int[0];
        for (int i=0; i < array.length; i++){
            if (array[i]%2 == 0) {
                arrayOfEvenNumbers = Arrays.copyOf(arrayOfEvenNumbers, arrayOfEvenNumbers.length+1);
                arrayOfEvenNumbers[arrayOfEvenNumbers.length-1] = array[i];
            }
        }
        return arrayOfEvenNumbers;
    }
}

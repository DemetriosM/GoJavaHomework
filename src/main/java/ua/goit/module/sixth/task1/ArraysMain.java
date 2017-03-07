package ua.goit.module.sixth.task1;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] arrayInt = ArraysUtils.fillIntegerArray(5, 25);
        System.out.printf("initial array - %s\n", Arrays.toString(arrayInt));
        System.out.printf("array after reverse - %s\n", Arrays.toString(ArraysUtils.reverse(arrayInt)));
        System.out.printf("even elements in array - %s\n", Arrays.toString(ArraysUtils.findEvenElements(arrayInt)));
        System.out.printf("sum of array elements = %d\n", ArraysUtils.sum(arrayInt));
        System.out.printf("minimal element = %d\n", ArraysUtils.min(arrayInt));
        System.out.printf("maximal element = %d\n", ArraysUtils.max(arrayInt));
        System.out.printf("maximum of the positive elements = %d\n", ArraysUtils.maxPositive(arrayInt));
        System.out.printf("multiplication of array elements = %d\n", ArraysUtils.multiplication(arrayInt));
        System.out.printf("module of the first element = %d\n", ArraysUtils.modulus(arrayInt)[0]);
        System.out.printf("module of the last element = %d\n", ArraysUtils.modulus(arrayInt)[1]);
        System.out.printf("second maximum element = %d\n", ArraysUtils.secondLargest(arrayInt));
    }
}

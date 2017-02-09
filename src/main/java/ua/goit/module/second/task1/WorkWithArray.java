package ua.goit.module.second.task1;

import java.util.Arrays;

public class WorkWithArray {
    public static void main(String[] args) {
        ArrayFillsAndCalculations arrayUtils = new ArrayFillsAndCalculations();
        int[] arrInt = arrayUtils.fillArray(10, 100);
        double[] arrDouble = arrayUtils.fillArray(10, 125.4);

        System.out.printf("Массив целых чисел: %s \n", Arrays.toString(arrInt));
        System.out.printf("Сумма элементов = %d\n", arrayUtils.sum(arrInt));
        System.out.printf("Минимальный элемент = %d\n", arrayUtils.min(arrInt));
        System.out.printf("Максимальный элемент = %d\n", arrayUtils.max(arrInt));
        System.out.printf("Максимальный из положительных элементов = %d\n", arrayUtils.maxPositive(arrInt));
        System.out.printf("Произведение элементов массива = %d\n", arrayUtils.multiplication(arrInt));
        System.out.printf("Модуль первого элемента массива = %d\n", arrayUtils.modulus(arrInt)[0]);
        System.out.printf("Модуль последнего элемента = %d\n", arrayUtils.modulus(arrInt)[1]);
        System.out.printf("Второй максимальный элемент массива = %d\n\n", arrayUtils.secondLargest(arrInt));

        System.out.printf("Массив десятичных чисел: %s\n", Arrays.toString(arrDouble));
        System.out.printf("Сумма элементов = %f\n", arrayUtils.sum(arrDouble));
        System.out.printf("Минимальный элемент = %f\n", arrayUtils.min(arrDouble));
        System.out.printf("Максимальный элемент = %f\n", arrayUtils.max(arrDouble));
        System.out.printf("Максимальный из положительных элементов = %f\n", arrayUtils.maxPositive(arrDouble));
        System.out.printf("Произведение элементов массива = %f\n", arrayUtils.multiplication(arrDouble));
        System.out.printf("Модуль первого элемента массива = %f\n", arrayUtils.modulus(arrDouble)[0]);
        System.out.printf("Модуль последнего элемента = %f\n", arrayUtils.modulus(arrDouble)[1]);
        System.out.printf("Второй максимальный элемент массива = %f\n", arrayUtils.secondLargest(arrDouble));
    }
}

package ua.goit.module.seventh.task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intArrayList = new ArrayList();
        List<String> stringArrayList = new ArrayList();
        List<Integer> intLinkedList = new LinkedList<>();
        List<String> stringLinkedList = new LinkedList<>();

        System.out.println("ArrayList<Integer> with 1000 elements");
        generateIntegerList(intArrayList, 1000);
        measureTimeAdding(intArrayList, 1, "Add");
        measureTimeDeleting(intArrayList, 1, "Remove");
        measureTimeSet(intArrayList, 0, 1, "Set");
        measureTimeGet(intArrayList, 0, "Get");
        System.out.println("\nLinkedList<Integer> with 1000 elements");
        generateIntegerList(intLinkedList, 1000);
        measureTimeAdding(intLinkedList, 1, "Add");
        measureTimeDeleting(intLinkedList, 1, "Remove");
        measureTimeSet(intLinkedList, 0, 1, "Set");
        measureTimeGet(intLinkedList, 0, "Get");

        System.out.println("\nArrayList<Integer> with 10000 elements");
        generateIntegerList(intArrayList, 10000);
        measureTimeAdding(intArrayList, 1, "Add.");
        measureTimeDeleting(intArrayList, 1, "Remove");
        measureTimeSet(intArrayList, 0, 1, "Set");
        measureTimeGet(intArrayList, 0, "Get");
        System.out.println("\nLinkedList<Integer> with 10000 elements");
        generateIntegerList(intLinkedList, 10000);
        measureTimeAdding(intLinkedList, 1, "Add");
        measureTimeDeleting(intLinkedList, 1, "Remove");
        measureTimeSet(intLinkedList, 0, 1, "Set");
        measureTimeGet(intLinkedList, 0, "Get");

        System.out.println("\nArrayList<String> with 1000 elements");
        generateStringList(stringArrayList, 1000);
        measureTimeAdding(stringArrayList,"string", "Add");
        measureTimeDeleting(stringArrayList, "string", "Remove");
        measureTimeSet(stringArrayList, 0, "string", "Set");
        measureTimeGet(stringArrayList, 0, "Get");
        System.out.println("\nLinkedList<String> with 1000 elements");
        generateStringList(stringLinkedList, 1000);
        measureTimeAdding(stringLinkedList,"string", "Add");
        measureTimeDeleting(stringLinkedList, "string", "Remove");
        measureTimeSet(stringLinkedList, 0, "string", "Set");
        measureTimeGet(stringLinkedList, 0, "Get");

        System.out.println("\nArrayList<String> with 10000 elements");
        generateStringList(stringArrayList,10000);
        measureTimeAdding(stringArrayList,"string", "Add");
        measureTimeDeleting(stringArrayList, "string", "Remove");
        measureTimeSet(stringArrayList, 0, "string", "Set");
        measureTimeGet(stringArrayList, 0, "Get");
        System.out.println("\nLinkedList<String> with 10000 elements");
        generateStringList(stringLinkedList, 10000);
        measureTimeAdding(stringLinkedList,"string", "Add");
        measureTimeDeleting(stringLinkedList, "string", "Remove");
        measureTimeSet(stringLinkedList, 0, "string", "Set");
        measureTimeGet(stringLinkedList, 0, "Get");
    }

    public static void generateIntegerList(List<Integer> list, int size){
        list.clear();
        for (int i = 0; i < size; i++){
            list.add(i);
        }
    }

    public static void generateStringList(List<String> list, int size){
        list.clear();
        for (int i = 0; i < size; i++){
            list.add("string " + i);
        }
    }

    public static <T> void measureTimeAdding(List<T> list, T item, String method){
        long duration, startTime = System.nanoTime();
        list.add(item);
        duration = System.nanoTime() - startTime;
        System.out.println(String.format("%s. Execution time: %d ns", method, duration));
    }

    public static <T> void measureTimeDeleting(List<T> list, T item, String method){
        long duration, startTime = System.nanoTime();
        list.remove(item);
        duration = System.nanoTime() - startTime;
        System.out.println(String.format("%s. Execution time: %d ns", method, duration));
    }

    public static <T> void measureTimeSet(List<T> list, int index, T item, String method){
        long duration, startTime = System.nanoTime();
        if (index < list.size() && index >= 0) list.set(index, item);
        duration = System.nanoTime() - startTime;
        System.out.println(String.format("%s. Execution time: %d ns", method, duration));
    }

    public static <T> void measureTimeGet(List<T> list, int index, String method){
        long duration, startTime = System.nanoTime();
        if (index < list.size() && index >= 0) list.get(index);
        duration = System.nanoTime() - startTime;
        System.out.println(String.format("%s. Execution time: %d ns", method, duration));
    }
}

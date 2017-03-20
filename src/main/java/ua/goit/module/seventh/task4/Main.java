package ua.goit.module.seventh.task4;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intArrayList = new ArrayList();
        List<String> stringArrayList = new ArrayList();
        List<Integer> intLinkedList = new LinkedList<>();
        List<String> stringLinkedList = new LinkedList<>();
        generateIntegerList(intArrayList, 1000);
        measureAddTime(intArrayList, 1);


    }

    public static void generateIntegerList(List<Integer> list, int size){
        for (int i = 0; i < size; i++){
            list.add(i);
        }
    }

    public static void generateStringList(List<String> list, int size){
        for (int i = 0; i < size; i++){
            list.add("string " + i);
        }
    }

    public static <T> void measureAddTime(List<T> list, T item){
        Instant start = Instant.now();
        list.add(item);
        Instant end = Instant.now();
        System.out.printf("Item was added in %d nanoseconds to %s",
                end.getLong(ChronoField.NANO_OF_SECOND) - start.getLong(ChronoField.NANO_OF_SECOND), list.getClass());
    }
}

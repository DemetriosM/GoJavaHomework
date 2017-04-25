package ua.goit.module.eleventh.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private final static String FILE_PATH = "src/main/java/ua/goit/module/eleventh/task1/text.txt";

    public static void main(String[] args) {
        Map<String, String> words = new HashMap<>();
        words.put("Hello", "Hi");
        words.put("!", "?");
        System.out.printf("\nAfter replacing:\n%s", replacer(words));
    }

    public static String replacer(Map<String, String> map) {
        String str="";
        try (BufferedReader reader = new BufferedReader(
                new FileReader(FILE_PATH ))){
            str = reader.lines().collect(Collectors.joining("\n"));
            System.out.printf("Base text:\n%s\n", str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Map.Entry<String, String> item : map.entrySet()){
            if (item.getValue() != null) str = str.replaceAll(item.getKey(), item.getValue());
        }
        return str;
    }
}

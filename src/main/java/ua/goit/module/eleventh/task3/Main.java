package ua.goit.module.eleventh.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private final static String FILE_PATH = "src/main/java/ua/goit/module/eleventh/task3/text.txt";

    public static void main(String[] args) {
        Map<String, String> words = new HashMap<>();
        words.put("Hello", "Hi");
        words.put("!", "?");
        fileContentMerger(words);
    }

    public static File fileContentMerger(Map<String, String> map) {
        File file = new File(FILE_PATH);
        try (BufferedReader reader = new BufferedReader(new FileReader(file.getPath()))){
            String str="";
            str = reader.lines().collect(Collectors.joining("\n"));
            System.out.printf("text.txt before append text:\n%s\n", str);
            for(Map.Entry<String, String> item : map.entrySet()){
                if (item.getValue() != null) str = str.replaceAll(item.getKey(), item.getValue());
            }
            Files.write(Paths.get(file.getPath()), str.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}

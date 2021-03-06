package ua.goit.module.eleventh.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class Main {
    private final static String FILE_PATH = "src/main/java/ua/goit/module/eleventh/task4/text.txt";

    public static void main(String[] args) {
        System.out.printf("The file has %d words \"World\"", checkWord("World"));
    }

    public static int checkWord(String word){
        //String str = readeUseTry();
        String str = readeUseTryWithResources();
        String[] strArr = str.split(word);
        int number = 0;
        if (strArr.length>0) number = strArr.length - 1;
        if (str.endsWith(word)) number++;

        return number;
    }

    private static String readeUseTry(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                new FileReader(FILE_PATH));
            String str = "";
            str = reader.lines().collect(Collectors.joining("\n"));
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        } finally {
            if (reader != null){
                try{
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static String readeUseTryWithResources(){
        try (BufferedReader reader = new BufferedReader(
                new FileReader(FILE_PATH))){
            String str = "";
            str = reader.lines().collect(Collectors.joining("\n"));
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }
}

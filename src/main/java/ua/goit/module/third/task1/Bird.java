package ua.goit.module.third.task1;

public class Bird {

    public static String sing(String word){
        return String.format("I'm %s\n\n", word);
    }

    public static String sing(String[] words){
        StringBuilder textOfSong = new StringBuilder();
        for(String item : words){
            textOfSong.append("I'm ");
            textOfSong.append(item);
            textOfSong.append("\n");
        }
        return textOfSong.toString();
    }
}

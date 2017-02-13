package ua.goit.module.third.task1;

public class TaskOneMain {
    public static void main(String[] args) {
        System.out.printf(Bird.sing("Bird"));
        String wordsOfSong[] = {"walking", "flying", "singing", "Bird"};
        System.out.printf(Bird.sing(wordsOfSong));
    }
}

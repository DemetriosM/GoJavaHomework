package ua.goit.module.third.task1;

public class TaskOneMain {
    public static final String[] WORDS_OF_SONGS = {"walking", "flying", "singing", "Bird"};
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.sing(WORDS_OF_SONGS);
    }
}

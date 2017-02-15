package ua.goit.module.third.task1;

public class TaskOneMain {
    public static void main(String[] args) {
        Bird bird = new Bird();
        final String[] WORDSOFSONGS = {"walking", "flying", "singing", "Bird"};
        bird.sing(WORDSOFSONGS[3]);
        bird.sing(WORDSOFSONGS);
    }
}

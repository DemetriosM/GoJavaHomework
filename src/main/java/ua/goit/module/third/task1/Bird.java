package ua.goit.module.third.task1;

public class Bird {

    public void sing(String word){
        System.out.printf("I'm %s\n", word);
    }

    public void sing(String[] words){
        for(String item : words){
            this.sing(item);
        }
    }
}

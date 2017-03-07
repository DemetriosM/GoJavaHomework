package ua.goit.module.sixth.task4;

public class CitizenMain {
    public static void main(String[] args) {
        Citizen[] citizens = new Citizen[]{
                CitizenFactory.englishman(),
                CitizenFactory.chinese(),
                CitizenFactory.russian(),
                CitizenFactory.italian()
        };
        for(Citizen man: citizens){
            man.sayHallo();
        }
    }
}

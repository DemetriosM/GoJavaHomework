package ua.goit.module.eighth.task1;

public class IdGenerator {
    private static int productNumber = 0;

    private IdGenerator(){}

    public static long generateId(String name, Country country, int expiration){
        return Long.parseLong(String.format("%d0%d0%d", ++productNumber, country.ordinal(), expiration));
    }
}

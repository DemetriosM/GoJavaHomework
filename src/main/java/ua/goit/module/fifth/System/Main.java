package ua.goit.module.fifth.System;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        System.out.println("Controller. Requests with different parameters\n");
        System.out.println("price 500 or less, persons not less than 2, city - Kiev, hotel - Ramada");
        System.out.printf("%s\n\n", Arrays.toString(controller.requestRooms(500, 2, "Kiev", "Ramada")));
        System.out.println("price 900 or less, persons not less than 1, city - Kharkiv, hotel - Avrora");
        System.out.printf("%s\n\n", Arrays.toString(controller.requestRooms(900, 1, "Kharkiv", "Avrora")));
        System.out.println("price 900 or less, persons not less than 2, city - Lviv, hotel - Astoria");
        System.out.printf("%s\n\n", Arrays.toString(controller.requestRooms(900, 2, "Lviv", "Astoria")));

        API api1 = new BookingComAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new GoogleAPI();
        System.out.println("\n\nBookingComAPI. Request.");
        System.out.println("price 500 or less, persons not less than 2, city - Kiev, hotel - Ramada");
        System.out.printf("%s\n\n", Arrays.toString(api1.findRooms(500, 2, "Kiev", "Ramada")));
        System.out.println("TripAdvisorAPI. Request.");
        System.out.println("price 900 or less and persons not less than 2, city - Kharkiv, hotel - Avrora");
        System.out.printf("%s\n\n", Arrays.toString(api2.findRooms(900, 2, "Kharkiv", "Avrora")));
        System.out.println("GoogleAPI. Request.");
        System.out.println("price 900 or less, persons not less than 3, city - Kharkiv, hotel - City Club");
        System.out.printf("%s\n\n", Arrays.toString(api3.findRooms(900, 3, "Kharkiv", "City Club")));

        System.out.println("\nBookingComAPI and TripAdvisorAPI return same rooms:");
        System.out.printf("%s", Arrays.toString(controller.check(api1, api2)));

        System.out.println("\n\nWork with DAO");
        Room deleteRoom = new Room(1003, 500, 4, new Date(), "Ramada", "Kiev");
        Room updateRoom = new Room(2003, 900, 4, new Date(), "Astoria", "Lviv");
        Room newRoom = new Room(5001, 400, 3, new Date(), "King", "Kiev");
        System.out.printf("The initial array\n%s\n\n", Arrays.toString(controller.getDao().getAll()));
        controller.getDao().findById(2002);
        controller.getDao().delete(deleteRoom);
        controller.getDao().update(updateRoom);
        controller.getDao().save(newRoom);
        System.out.printf("Array after manipulation\n%s", Arrays.toString(controller.getDao().getAll()));
    }
}

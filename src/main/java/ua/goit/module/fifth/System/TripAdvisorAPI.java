package ua.goit.module.fifth.System;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TripAdvisorAPI implements API {
    private Room[] rooms;
    private Calendar dateAvailableFrom;

    public TripAdvisorAPI() {
        dateAvailableFrom = new GregorianCalendar(2017, Calendar.MARCH, 3);
        rooms = new Room[]{
                new Room(2001, 420, 2, dateAvailableFrom.getTime(), "Astoria", "Kiev"),
                new Room(2002, 240, 2, dateAvailableFrom.getTime(), "Avrora", "Kharkiv"),
                new Room(2003, 650, 3, dateAvailableFrom.getTime(), "Astoria", "Lviv"),
                new Room(2004, 300, 2, dateAvailableFrom.getTime(), "Ramada", "Kiev"),
                new Room(2005, 550, 3, dateAvailableFrom.getTime(), "Atlas", "Lviv"),
        };
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] foundRooms = new Room[0];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() <= price && rooms[i].getPersons() >= persons &&
                    rooms[i].getCityName().equals(city) && rooms[i].getHotelName().equals(hotel)){
                foundRooms = Arrays.copyOf(foundRooms, foundRooms.length+1);
                foundRooms[foundRooms.length-1] = rooms[i];
            }
        }
        return foundRooms;
    }

    @Override
    public Room[] getRooms() {
        return rooms;
    }
}

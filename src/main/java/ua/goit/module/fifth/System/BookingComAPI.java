package ua.goit.module.fifth.System;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BookingComAPI implements API {
    private Room[] rooms;
    private Calendar dateAvailableFrom;

    public BookingComAPI() {
        dateAvailableFrom = new GregorianCalendar(2017, Calendar.MARCH, 1);
        rooms = new Room[]{
                new Room(1001, 300, 2, dateAvailableFrom.getTime(), "Ramada", "Kiev"),
                new Room(1002, 400, 3, dateAvailableFrom.getTime(), "Atlas", "Kiev"),
                new Room(1003, 500, 2, dateAvailableFrom.getTime(), "Ramada", "Kiev"),
                new Room(1004, 600, 2, dateAvailableFrom.getTime(), "Rits", "Kiev"),
                new Room(1005, 800, 3, dateAvailableFrom.getTime(), "Rits", "Lviv"),
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

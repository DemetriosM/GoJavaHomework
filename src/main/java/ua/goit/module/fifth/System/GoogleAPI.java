package ua.goit.module.fifth.System;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GoogleAPI implements API{
    private Room[] rooms;
    private Calendar dateAvailableFrom;

    public GoogleAPI() {
        dateAvailableFrom = new GregorianCalendar(2017, Calendar.MARCH, 5);
        rooms = new Room[]{
                new Room(3001, 240, 2, dateAvailableFrom.getTime(), "Avrora", "Kharkiv"),
                new Room(3002, 310, 3, dateAvailableFrom.getTime(), "Avrora", "Kharkiv"),
                new Room(3003, 410, 2, dateAvailableFrom.getTime(), "City Club", "Lviv"),
                new Room(3004, 570, 2, dateAvailableFrom.getTime(), "Rits", "Kiev"),
                new Room(3005, 620, 4, dateAvailableFrom.getTime(), "City Club", "Kharkiv"),
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

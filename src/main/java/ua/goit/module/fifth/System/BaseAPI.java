package ua.goit.module.fifth.System;

import java.util.Arrays;

public abstract class BaseAPI implements API {
    @Override
    public abstract Room[] getRooms();

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] foundRooms = new Room[0];
        for (int i = 0; i < getRooms().length; i++) {
            if (getRooms()[i].getPrice() <= price && getRooms()[i].getPersons() >= persons &&
                    getRooms()[i].getCityName().equals(city) && getRooms()[i].getHotelName().equals(hotel)){
                foundRooms = Arrays.copyOf(foundRooms, foundRooms.length+1);
                foundRooms[foundRooms.length-1] = getRooms()[i];
            }
        }
        return foundRooms;
    }
}

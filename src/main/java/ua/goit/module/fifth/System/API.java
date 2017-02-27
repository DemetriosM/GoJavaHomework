package ua.goit.module.fifth.System;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getRooms();
}

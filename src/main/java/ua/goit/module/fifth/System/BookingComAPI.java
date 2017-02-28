package ua.goit.module.fifth.System;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookingComAPI extends BaseAPI {
    private Room[] rooms;

    public BookingComAPI() throws ParseException {
        rooms = new Room[]{
                new Room(1001, 300, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("08-03-2017"), "Ramada", "Kiev"),
                new Room(1002, 400, 3, (new SimpleDateFormat("dd-MM-yyyy")).parse("11-03-2017"), "Atlas", "Kiev"),
                new Room(1003, 500, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("07-03-2017"), "Ramada", "Kiev"),
                new Room(1004, 600, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("15-03-2017"), "Rits", "Kiev"),
                new Room(1005, 800, 3, (new SimpleDateFormat("dd-MM-yyyy")).parse("24-03-2017"), "Rits", "Lviv"),
        };
    }

    @Override
    public Room[] getRooms() {
        return rooms;
    }
}

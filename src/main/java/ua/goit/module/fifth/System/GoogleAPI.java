package ua.goit.module.fifth.System;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GoogleAPI extends BaseAPI {
    private Room[] rooms;

    public GoogleAPI() throws ParseException {
        rooms = new Room[]{
                new Room(3001, 240, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("04-03-2017"), "Avrora", "Kharkiv"),
                new Room(3002, 310, 3, (new SimpleDateFormat("dd-MM-yyyy")).parse("09-03-2017"), "Avrora", "Kharkiv"),
                new Room(3003, 410, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("02-03-2017"), "City Club", "Lviv"),
                new Room(3004, 570, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("22-03-2017"), "Rits", "Kiev"),
                new Room(3005, 620, 4, (new SimpleDateFormat("dd-MM-yyyy")).parse("21-04-2017"), "City Club", "Kharkiv"),
        };
    }

    @Override
    public Room[] getRooms() {
        return rooms;
    }
}

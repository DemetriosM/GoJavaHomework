package ua.goit.module.fifth.System;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TripAdvisorAPI extends BaseAPI {
    private Room[] rooms;

    public TripAdvisorAPI() throws ParseException {
        rooms = new Room[]{
                new Room(2001, 420, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("21-03-2017"), "Astoria", "Kiev"),
                new Room(2002, 240, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("17-03-2017"), "Avrora", "Kharkiv"),
                new Room(2003, 650, 3, (new SimpleDateFormat("dd-MM-yyyy")).parse("07-03-2017"), "Astoria", "Lviv"),
                new Room(2004, 300, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("06-04-2017"), "Ramada", "Kiev"),
                new Room(2005, 550, 3, (new SimpleDateFormat("dd-MM-yyyy")).parse("01-03-2017"), "Atlas", "Lviv"),
        };
    }

    @Override
    public Room[] getRooms() {
        return rooms;
    }
}

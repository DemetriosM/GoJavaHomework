package ua.goit.module.fifth.System;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DAOImpl implements DAO{
    private Room[] rooms;

    public DAOImpl() throws ParseException {
        this.rooms = new Room[]{
                new Room(1003, 500, 4, (new SimpleDateFormat("dd-MM-yyyy")).parse("01-03-2017"), "Ramada", "Kiev"),
                new Room(1004, 600, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("04-03-2017"), "Rits", "Kiev"),
                new Room(2002, 550, 3, (new SimpleDateFormat("dd-MM-yyyy")).parse("23-03-2017"), "Astoria", "Lviv"),
                new Room(2003, 650, 3, (new SimpleDateFormat("dd-MM-yyyy")).parse("02-03-2017"), "Astoria", "Lviv"),
                new Room(2004, 350, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("15-03-2017"), "Atlas", "Lviv"),
                new Room(3001, 240, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("14-03-2017"), "Avrora", "Kharkiv"),
                new Room(3002, 310, 3, (new SimpleDateFormat("dd-MM-yyyy")).parse("27-03-2017"), "Avrora", "Kharkiv"),
                new Room(3003, 410, 2, (new SimpleDateFormat("dd-MM-yyyy")).parse("09-03-2017"), "City Club ", "Kharkiv"),
                new Room(3004, 570, 3, (new SimpleDateFormat("dd-MM-yyyy")).parse("06-03-2017"), "City Club ", "Kharkiv"),
                new Room(4004, 50, 1, (new SimpleDateFormat("dd-MM-yyyy")).parse("05-03-2017"), "Hostel", "Dnepr")
        };
    }

    @Override
    public Room save(Room room) {
        System.out.printf("add room - %s\n", room);
        Room[] afterAddRoom = Arrays.copyOf(this.rooms, this.rooms.length+1);
        afterAddRoom[afterAddRoom.length-1] = room;
        this.rooms = afterAddRoom;
        return this.rooms[rooms.length-1];
    }

    @Override
    public boolean delete(Room room) {
        System.out.printf("delete - %s\n", room);
        for(int i=0; i<this.rooms.length; i++){
            if (rooms[i].equals(room)){
                Room[] tempRooms = new Room[this.rooms.length-1];
                System.arraycopy(this.rooms, 0, tempRooms, 0, i);
                System.arraycopy(this.rooms, i+1, tempRooms, i, this.rooms.length-(i+1));
                this.rooms = tempRooms;
                return true;
            }
        }
        return false;
    }

    @Override
    public Room update(Room room) {
        for(int i=0; i<this.rooms.length; i++){
            if (this.rooms[i].getId() == room.getId()){
                System.out.printf("update - %s", rooms[i]);
                this.rooms[i] = room;
                System.out.printf("after update - %s\n", rooms[i]);
                return this.rooms[i];
            }
        }
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.printf("findById - %d\n", id);
        for(int i=0; i<this.rooms.length; i++){
            if (this.rooms[i].getId() == id){
                System.out.println(rooms[i]);
                return this.rooms[i];
            }
        }
        return null;
    }

    @Override
    public Room[] getAll() {
        return this.rooms;
    }
}

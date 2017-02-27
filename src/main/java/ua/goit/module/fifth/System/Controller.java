package ua.goit.module.fifth.System;

import java.util.Arrays;

public class Controller {
    private API apis[] = new API[3];
    private DAO dao;

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2] = new GoogleAPI();
        dao = new DAOImpl();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel){
        Room[] foundRoomsFromOneAPI, foundRoomsTemp, allFoundRooms;
        allFoundRooms = new Room[0];
        for (int i = 0; i < apis.length; i++) {
            foundRoomsFromOneAPI = apis[i].findRooms(price, persons, city, hotel);
            if (foundRoomsFromOneAPI.length != 0) {
                foundRoomsTemp = Arrays.copyOf(allFoundRooms, allFoundRooms.length);
                allFoundRooms = new Room[foundRoomsTemp.length + foundRoomsFromOneAPI.length];
                System.arraycopy(foundRoomsTemp, 0, allFoundRooms, 0, foundRoomsTemp.length);
                System.arraycopy(foundRoomsFromOneAPI, 0, allFoundRooms,
                        foundRoomsTemp.length, foundRoomsFromOneAPI.length);
            }
        }
        return allFoundRooms;
    }

    public Room[] check(API api1, API api2){
        Room[] sameRooms = new Room[0];
        for (int i = 0; i < api1.getRooms().length; i++) {
            for (int j = 0; j < api2.getRooms().length; j++) {
                if (api1.getRooms()[i].equals(api2.getRooms()[j])){
                    sameRooms = Arrays.copyOf(sameRooms, sameRooms.length+1);
                    sameRooms[sameRooms.length-1] = api1.getRooms()[i];
                }
            }
        }
        return sameRooms;
    }

    public DAO getDao() {
        return dao;
    }
}

package ua.goit.module.fifth.System;

import java.util.Date;

public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getPersons() {
        return persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        if (getPrice() != room.getPrice() || getPersons() != room.getPersons()) return false;
        return getCityName() != null ? getCityName().equals(room.getCityName()) : room.getCityName() == null;
    }

    @Override
    public int hashCode() {
        int result = getPrice();
        result = 31 * result + getPersons();
        result = 31 * result + (getCityName() != null ? getCityName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("id: %d, city: %s hotel: %s, price: %d, persons: %d, available from %td-%tm-%tY\n",
                this.getId(), this.getCityName(), this.getHotelName(), this.getPrice(), this.getPersons(),
                this.getDateAvailableFrom(), this.getDateAvailableFrom(), this.getDateAvailableFrom());
    }
}

package ua.goit.module.eighth.task2;

import ua.goit.module.eighth.task1.Country;
import ua.goit.module.eighth.task1.IdGenerator;

public class Food {
    private long id;
    private String name;
    private Country country;
    private int expiration;

    public Food(String name, Country country, int expiration) {
        this.name = name;
        this.country = country;
        this.expiration = expiration;
        this.id = IdGenerator.generateId(name, country, expiration);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return String.format("id: %d - name: %s, country: %s, expiration: %d days.",
                getId(), getName(), getCountry(), getExpiration());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return getId() == food.getId();
    }

    @Override
    public int hashCode() {
        return (int) (getId() ^ (getId() >>> 32));
    }
}

package ua.goit.module.ninth.task1;

import ua.goit.module.fourth.Currency;
import ua.goit.module.seventh.task1.Order;
import ua.goit.module.seventh.task1.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("Oleg", "Petrov", "Kiev", 1000),
                new User("Igor", "Romanov", "Kiev", 10000),
                new User("Olga", "Taruta", "Kiev", 9000),
                new User("Sasha", "Golovko", "Kharkiv", 7000),
                new User("Denis", "Drozd", "Lviv", 15000),
                new User("Masha", "Mironova", "Odessa", 12000),
                new User("Maksim", "Shkvary", "Kiev", 13000),
                new User("Anton", "Petrov", "Kiev", 2000),
                new User("Irina", "Gordon", "Kharkiv", 14300),
                new User("Dmitry", "Zaricin", "Dnepr", 2000),
        };
        List<Order> orders = new ArrayList<Order>();
        orders.add(new Order(700, Currency.USD, "Samsung Galaxy", "Rozetka", users[0]));
        orders.add(new Order(700, Currency.USD, "Samsung Galaxy", "Rozetka", users[0]));
        orders.add(new Order(2000, Currency.USD, "IPhone", "Rozetka", users[2]));
        orders.add(new Order(2000, Currency.USD, "IPhone", "Rozetka", users[3]));
        orders.add(new Order(14000, Currency.USD, "Fiesta", "Ford", users[4]));
        orders.add(new Order(2500, Currency.USD, "TV", "Philips", users[5]));
        orders.add(new Order(1700, Currency.USD, "Washing machine", "Ariston", users[6]));
        orders.add(new Order(200, Currency.EUR, "TV", "Saturn", users[7]));
        orders.add(new Order(1550, Currency.EUR, "Tablet", "Rozetka", users[8]));
        orders.add(new Order(1700, Currency.EUR, "Tablet", "Rozetka", users[9]));

        System.out.println("\nafter sort by price in decrease order:");
        ManageSystem.sortByPriceLess(orders);
        System.out.println(orders);

        System.out.println("\nafter sort by price in increase order and User city:");
        ManageSystem.sortByPriceAndCity(orders);
        System.out.println(orders);

        System.out.println("\nafter sort by itemName and ShopIdentificator and User city:");
        ManageSystem.sortByNameIdentificatorCity(orders);
        System.out.println(orders);

        System.out.printf("\nafter delete duplicates: \n%s\n", ManageSystem.deleteDuplicates(orders));

        ManageSystem.deleteWherePriceLess(orders, 1500);
        System.out.printf("\nafter delete items where price less than 1500: \n%s\n", orders);

        System.out.printf("\nafter separate for two list - orders in USD and EUR: \n%s\n",
                ManageSystem.separateByCurrency(orders));

        System.out.printf("\nafter separate by unique cities are in User: \n%s\n",
                ManageSystem.separateByUniqueCity(orders));

        Set<Order> orderSet = new HashSet<>(orders);
        System.out.printf("\nSet contain Order where User’s lastName is - Petrov:  %b\n",
                ManageSystem.checkOrdersForContainLastName(orderSet, "Petrov"));

        ManageSystem.deleteOrdersInUSD(orderSet, Currency.USD);
        System.out.printf("\nafter delete orders in Set where currency is USD: %s", orderSet);
    }
}

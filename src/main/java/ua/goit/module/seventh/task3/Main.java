package ua.goit.module.seventh.task3;

import ua.goit.module.fourth.Currency;
import ua.goit.module.seventh.task1.Order;
import ua.goit.module.seventh.task1.User;

import java.util.*;

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
        SortedSet<Order> orders = new TreeSet<>(Comparator.comparing(Order::getPrice));
        orders.add(new Order(700, Currency.USD, "Samsung Galaxy", "Rozetka", users[0]));
        orders.add(new Order(700, Currency.USD, "Samsung Galaxy", "Rozetka", users[0]));
        orders.add(new Order(2000, Currency.USD, "IPhone", "Rozetka", users[2]));
        orders.add(new Order(2000, Currency.USD, "IPhone", "Rozetka", users[3]));
        orders.add(new Order(14000, Currency.USD, "Fiesta", "Ford", users[4]));
        orders.add(new Order(2500, Currency.USD, "TV", "Philips", users[5]));
        orders.add(new Order(1600, Currency.USD, "Washing machine", "Ariston", users[6]));
        orders.add(new Order(200, Currency.EUR, "TV", "Saturn", users[7]));
        orders.add(new Order(1550, Currency.EUR, "Tablet", "Rozetka", users[8]));
        orders.add(new Order(1700, Currency.EUR, "Tablet", "Rozetka", users[9]));
        System.out.printf("initial list: \n%s\n", Arrays.toString(orders.toArray()));

        System.out.printf("\nSet contain Order where User’s lastName is - Petrov:  %b",
                checkOrdersForContainLastName(orders, "Petrov"));

        System.out.printf("\nOrder with largest price: %s\n", orders.last());

        deleteOrdersByCurrency(orders, Currency.USD);
        System.out.printf("\nafter delete orders where currency is USD: \n%s", Arrays.toString(orders.toArray()));
    }

    private static boolean checkOrdersForContainLastName(Set<Order> orders, String lastName) {
        List<Order> ordersArray = new ArrayList<>(orders);
        for (int i=0; i<ordersArray.size(); i++){
            if (ordersArray.get(i).getUser().getLastName().equals(lastName)) return true;
        }
        return false;
    }

    private static void deleteOrdersByCurrency(SortedSet<Order> orders, Currency currency) {
        Iterator<Order> itr = orders.iterator();
        while(itr.hasNext()){
            Order order = itr.next();
            if (order.getCurrency() == currency) itr.remove();
        }
    }
}

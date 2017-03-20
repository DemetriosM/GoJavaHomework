package ua.goit.module.seventh.task2;

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
        List<Order> orders = new ArrayList<Order>();
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
        System.out.printf("initial list: \n%s\n", orders);

        System.out.println("\nafter sort by price in decrease order:");
        orders.sort((Order o1, Order o2) -> o2.getPrice() - o1.getPrice());
        System.out.println(orders);

        System.out.println("\nafter sort by price in increase order and User city:");
        orders.sort((Order o1, Order o2) -> {
                int margin = o1.getPrice() - o2.getPrice();
                if (margin == 0) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return margin;
        });
        System.out.println(orders);

        System.out.println("\nafter sort by itemName and ShopIdentificator and User city:");
        orders.sort((Order o1, Order o2) -> {
                int marginItemName = o1.getItemName().compareTo(o2.getItemName());
                if (marginItemName == 0) {
                    int marginShopIdentifier = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                    if (marginShopIdentifier == 0){
                        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    }
                    return marginShopIdentifier;
                }
                return marginItemName;
        });
        System.out.println(orders);

        deleteDuplicates(orders);
        System.out.printf("\n\"orders\" after delete duplicates: \n%s\n",orders);

        deleteWherePriceLess(orders, 1500);
        System.out.printf("\n\"orders\" after delete items where price less than 1500: \n%s\n", orders);

        List<List<Order>> ordersSeparatedByCurrency = separateByCurrency(orders);
        System.out.printf("\n\"ordersClone\" after separate for two list - orders in USD and EUR: \n%s\n%s\n",
                ordersSeparatedByCurrency.get(0), ordersSeparatedByCurrency.get(1));

        List<List<Order>> ordersSeparatedByCity = separateByUniqueCity(orders);
        System.out.printf("\n\"ordersClone\" after separate by unique cities are in User: \n%s\n",
                ordersSeparatedByCity);
    }

    private static void deleteDuplicates(List<Order> orders) {
        Set<Order> ordersWithoutDuplicates = new LinkedHashSet<>(orders);
        orders.clear();
        orders.addAll(ordersWithoutDuplicates);
    }

    private static void deleteWherePriceLess(List<Order> orders, int priceLimit) {
        orders.removeIf((Order order) -> order.getPrice() < priceLimit);
    }

    private static List<List<Order>> separateByCurrency(List<Order> orders) {
        List<List<Order>> list = new ArrayList<>();
        orders.sort(Comparator.comparing(Order::getCurrency));
        int previousIndex = 0;
        for (int i=1; i<orders.size(); i++){
            if (!orders.get(i).getCurrency().equals(orders.get(i-1).getCurrency())){
                list.add(orders.subList(previousIndex,i));
                previousIndex = i;
            }
        }
        list.add(orders.subList(previousIndex, orders.size()));
        return list;
    }

    private static List<List<Order>> separateByUniqueCity(List<Order> orders) {
        List<List<Order>> list = new ArrayList<>();
        orders.sort((Order o1, Order o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity()));
        int previousIndex = 0;
        for (int i=1; i<orders.size(); i++){
            if (!orders.get(i).getUser().getCity().equals(orders.get(i-1).getUser().getCity())){
                list.add(orders.subList(previousIndex, i));
                previousIndex = i;
            }
        }
        list.add(orders.subList(previousIndex, orders.size()));
        return list;
    }
}

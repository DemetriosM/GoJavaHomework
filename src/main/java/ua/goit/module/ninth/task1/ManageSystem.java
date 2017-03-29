package ua.goit.module.ninth.task1;

import ua.goit.module.fourth.Currency;
import ua.goit.module.seventh.task1.Order;

import java.util.*;
import java.util.stream.Collectors;

public class ManageSystem  {

    private ManageSystem(){}

    public static <T extends Order> void sortByPriceLess(List<T> list){
        list.sort((o1, o2)->o2.getPrice()-o1.getPrice());
    }

    public static <T extends Order> void sortByPriceAndCity(List<T> list){
        list.sort((Comparator.comparing(Order::getPrice))
                .thenComparing((o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity())));
    }

    public static <T extends Order> void sortByNameIdentificatorCity(List<T> list){
        list.sort((Comparator.comparing(Order::getPrice))
                .thenComparing(Comparator.comparing(Order::getShopIdentificator))
                .thenComparing((o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity())));
    }

    public static <T extends Order> List<T> deleteDuplicates(List<T> orders) {
       return orders.stream().distinct().collect(Collectors.toList());
    }

    public static <T extends Order> void deleteWherePriceLess(List<T> orders, int priceLimit) {
        orders.removeIf(order -> order.getPrice() < priceLimit);
    }

    public static <T extends Order> List<List<T>> separateByCurrency(List<T> orders) {
        return new ArrayList<>(orders.stream().collect(Collectors.groupingBy((o)->o.getCurrency())).values());
    }

    public static <T extends Order> List<List<T>> separateByUniqueCity(List<T> orders) {
        return new ArrayList<>(orders.stream().collect(Collectors.groupingBy((o)->o.getUser().getCity())).values());
    }

    public static <T extends Order> boolean checkOrdersForContainLastName(Set<T> orders, String lastName) {
        return orders.stream().anyMatch(o->o.getUser().getLastName()==lastName);
    }

    public static <T extends Order> void deleteOrdersInUSD(Set<T> orders, Currency currency) {
        orders.removeIf(o->o.getCurrency()== currency);
    }
}

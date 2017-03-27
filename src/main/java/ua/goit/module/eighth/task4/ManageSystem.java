package ua.goit.module.eighth.task4;

import ua.goit.module.eighth.task2.Food;
import ua.goit.module.eighth.task3.IManageSystem;

import java.util.*;

public class ManageSystem implements IManageSystem<Food>{
    private static Map<Food, Double> database = new HashMap<>();
    private double defaultPrice = 0.0;

    @Override
    public Food save(Food obj, double price) {
        database.put(obj, price);
        return obj;
    }

    @Override
    public Food save(Food obj) {
        database.put(obj, defaultPrice);
        return obj;
    }

    @Override
    public void delete(Food obj) {
        database.remove(obj);
    }

    @Override
    public void deleteById(int id) {
        if (this.get(id) != null) database.remove(this.get(id));
    }

    @Override
    public Food get(int id) {
        for(Food food: database.keySet()){
            if (food.getId() == id) return food;
        }
        return null;
    }

    @Override
    public Double getPrice(Food obj) {
        return database.getOrDefault(obj, defaultPrice);
    }

    @Override
    public Set<Food> getProducts() {
        return database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return new ArrayList<Double>(database.values());
    }

    @Override
    public void printProductsSortedByName() {
        List<Map.Entry<Food, Double>> sortedDataBase = new ArrayList(database.entrySet());
        Collections.sort(sortedDataBase, Map.Entry.comparingByKey(Comparator.comparing(Food::getName)));
        for (Map.Entry<Food, Double> item: sortedDataBase){
            System.out.printf("Product: %s  Price: %.2f UAH.\n", item.getKey(), item.getValue());
        }
    }

    @Override
    public void printProductsSortedByPrice() {
        List<Map.Entry<Food, Double>> sortedDataBase = new ArrayList(database.entrySet());
        Collections.sort(sortedDataBase, Comparator.comparing(Map.Entry::getValue));
        for (Map.Entry<Food, Double> item: sortedDataBase){
            System.out.printf("Product: %s  Price: %.2f UAH.\n", item.getKey(), item.getValue());
        }
    }
}

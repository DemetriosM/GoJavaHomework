package ua.goit.module.eighth.task5;

import ua.goit.module.eighth.task1.Country;
import ua.goit.module.eighth.task2.Food;
import ua.goit.module.eighth.task3.IManageSystem;
import ua.goit.module.eighth.task4.ManageSystem;

public class Main {
    public static void main(String[] args) {
        IManageSystem<Food> manageSystem = new ManageSystem();
        Food[] foods = new Food[]{
                new Food("bread", Country.UKRAINE, 2),
                new Food("meat", Country.UKRAINE, 7),
                new Food("meat", Country.POLAND, 14),
                new Food("butter", Country.FRANCE, 14),
                new Food("canned corn", Country.GERMANY, 360),
                new Food("rice", Country.CHINA, 280),
                new Food("rice", Country.UKRAINE, 28)
        };
        manageSystem.save(foods[0], 10.50);
        manageSystem.save(foods[1],75.20);
        manageSystem.save(foods[2], 90.00);
        manageSystem.save(foods[3], 200.00);
        manageSystem.save(foods[4], 18.00);
        manageSystem.save(foods[5], 30.00);
        manageSystem.save(foods[6]);
        System.out.println("Foods sorted by name:");
        manageSystem.printProductsSortedByName();

        System.out.printf("\n%s (%s) price - %.2f UAH\n",
                foods[0].getName(), foods[0].getCountry(), manageSystem.getPrice(foods[0]));
        System.out.printf("\nProducts: %s", manageSystem.getProducts());
        System.out.printf("\nPrices: %s", manageSystem.getPrices());

        manageSystem.delete(foods[6]);
        System.out.printf("\n\nProduct \"%s\" was removed", foods[6]);
        manageSystem.deleteById(10002);
        System.out.printf("\nProduct with id %d was removed", 10002);

        System.out.println("\n\nFoods sorted by price:");
        manageSystem.printProductsSortedByPrice();
    }
}

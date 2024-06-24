

import beverage.BeverageInterface;
import coffee.CoffeeInterface;
import dessert.DessertInterface;
import factory.MealFactory;
import meal.Assiette;
import meal.MealInterface;
import meal.Sandwich;


public class App {
    public int Compute(String type, String name, String beverage, String size, String dessert, String dsize,
            String coffee) {
        if (type == null || name == null || type.isEmpty() || name.isEmpty()) {
            return -1;
        }

        MealInterface meal = MealFactory.createMeal(type);
        BeverageInterface bev = MealFactory.createBeverage(size);
        DessertInterface des = MealFactory.createDessert(dessert);
        CoffeeInterface cof = MealFactory.createCoffee(coffee);

        int total = meal.getPrice() + bev.getPrice() + des.getPrice();

        if (meal instanceof Assiette) {
            if (size.equals("moyen") && dsize.equals("normal")) {
                System.out.println("Prix Formule Standard appliquée");
                total = 18;
            } else if (size.equals("grand") && dsize.equals("normal")) {
                System.out.println("Prix Formule Max appliquée");
                total = 21;
            }
        } else if (meal instanceof Sandwich) {
            if (size.equals("moyen") && dsize.equals("normal")) {
                System.out.println("Prix Formule Standard appliquée");
                total = 13;
            } else if (size.equals("grand") && dsize.equals("normal")) {
                System.out.println("Prix Formule Max appliquée");
                total = 16;
            }
        }

        if (coffee.equals("yes")) {
            System.out.println(" avec café offert!");
        } else {
            total += cof.getPrice();
        }

        return total;
    }
}

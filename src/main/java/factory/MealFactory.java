package factory;

import beverage.BeverageInterface;
import beverage.LargeBeverage;
import beverage.MediumBeverage;
import beverage.SmallBeverage;
import coffee.CoffeeImpl;
import coffee.CoffeeInterface;
import dessert.DessertInterface;
import dessert.NormalDessert;
import dessert.SpecialDessert;
import meal.Assiette;
import meal.MealInterface;
import meal.Sandwich;

public class MealFactory {
    public static MealInterface createMeal(String type) {
        switch (type) {
            case "assiette":
                return new Assiette();
            case "sandwich":
                return new Sandwich();
            default:
                throw new IllegalArgumentException("Invalid meal type: " + type);
        }
    }

    public static BeverageInterface createBeverage(String size) {
        switch (size) {
            case "petit":
                return new SmallBeverage();
            case "moyen":
                return new MediumBeverage();
            case "grand":
                return new LargeBeverage();
            default:
                throw new IllegalArgumentException("Invalid beverage size: " + size);
        }
    }

    public static DessertInterface createDessert(String dsize) {
        switch (dsize) {
            case "normal":
                return new NormalDessert();
            case "special":
                return new SpecialDessert();
            default:
                throw new IllegalArgumentException("Invalid dessert size: " + dsize);
        }
    }

    public static CoffeeInterface createCoffee(String coffee) {
        if (coffee.equals("yes")) {
            return new CoffeeImpl();
        }
        return null;
    }
}

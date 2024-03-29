package DecoratorPattern;

import DecoratorPattern.CoffeTypes.Espresso;
import DecoratorPattern.CoffeTypes.HouseBlend;
import DecoratorPattern.Condiments.Milk;
import DecoratorPattern.Condiments.Mocha;

public class StarbuzzCoffe {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("-->" + beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        System.out.println("-->" + beverage2.getDescription() + " $" + beverage2.cost());

        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println("-->" + beverage2.getDescription() + " $" + beverage2.cost());
    }
}

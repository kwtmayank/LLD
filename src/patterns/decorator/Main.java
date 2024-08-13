package patterns.decorator;

import patterns.decorator.pizza.BasePizza;
import patterns.decorator.pizza.FarmHousePizza;
import patterns.decorator.toppings.Corn;
import patterns.decorator.toppings.ExtraCheese;
import patterns.decorator.toppings.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Corn(new Mushroom(new ExtraCheese(new FarmHousePizza())));
        System.out.println("Total Pizza cost is "+pizza.cost());

    }
}

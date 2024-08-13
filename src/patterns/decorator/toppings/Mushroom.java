package patterns.decorator.toppings;

import patterns.decorator.pizza.BasePizza;

public class Mushroom extends ToppingDecorator {
    BasePizza basePizza;
    int cost = 30;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        System.out.println("Adding Mushroom for Rs."+cost);
        return basePizza.cost()+cost;
    }
}

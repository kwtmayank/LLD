package patterns.decorator.toppings;

import patterns.decorator.pizza.BasePizza;

public class Corn extends ToppingDecorator {
    BasePizza basePizza;
    int cost = 30;

    public Corn(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        System.out.println("Adding corn for Rs."+cost);
        return basePizza.cost()+cost;
    }
}


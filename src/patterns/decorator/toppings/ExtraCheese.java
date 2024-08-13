package patterns.decorator.toppings;

import patterns.decorator.pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;
    int cost = 20;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        System.out.println("Adding Extra cheese for Rs."+cost);
        return basePizza.cost()+cost;
    }
}

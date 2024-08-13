package patterns.decorator.pizza;

public class MargaritaPizza extends BasePizza{
    int cost = 100;
    @Override
    public int cost() {
        System.out.println("Creating new Margarita pizza for Rs."+cost);
        return cost;
    }
}

package patterns.decorator.pizza;

public class VeggieDelight extends BasePizza{
    int cost=200;
    @Override
    public int cost() {
        System.out.println("Creating new Veggie Delight pizza for Rs."+cost);
        return cost;
    }
}

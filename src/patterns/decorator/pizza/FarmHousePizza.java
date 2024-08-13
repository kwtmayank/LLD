package patterns.decorator.pizza;

public class FarmHousePizza extends BasePizza{
    int cost = 300;
    @Override
    public int cost() {
        System.out.println("Creating new Farmhouse pizza for Rs."+cost);
        return cost;
    }
}

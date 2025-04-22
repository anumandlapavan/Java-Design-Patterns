package _02_StructuralDesignPatterns._3_DecoratorPattern;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public double getCost() {
        return coffee.getCost() + 1.0;
    }
}

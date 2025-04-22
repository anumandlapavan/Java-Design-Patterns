package _02_StructuralDesignPatterns._3_DecoratorPattern;

public class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }
    public double getCost() {
        return 5.0;
    }
}

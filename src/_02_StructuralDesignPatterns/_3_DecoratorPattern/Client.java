package _02_StructuralDesignPatterns._3_DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());
    }
}

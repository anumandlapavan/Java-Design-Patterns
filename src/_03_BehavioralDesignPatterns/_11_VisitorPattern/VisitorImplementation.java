package _03_BehavioralDesignPatterns._11_VisitorPattern;

public class VisitorImplementation implements Visitor{
    @Override
    public void visit(BookElement book) {
        int cost = book.getPrice();
        System.out.println("Book ISBN: " + book.getIsbn() + " Cost: " + cost);
    }

    @Override
    public void visit(FruitElement fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " Cost: " + cost);
    }
}

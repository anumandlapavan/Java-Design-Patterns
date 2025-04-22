package _03_BehavioralDesignPatterns._11_VisitorPattern;

public class Client {
    public static void main(String[] args) {
        Element[] items = new Element[] {
                new BookElement(50, "1234"),
                new FruitElement(10, 2, "Banana"),
                new BookElement(100, "5678"),
                new FruitElement(5, 5, "Apple")
        };

        VisitorImplementation visitor = new VisitorImplementation();

        for (Element item : items) {
             item.accept(visitor);
        }
    }
}

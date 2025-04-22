package _03_BehavioralDesignPatterns._11_VisitorPattern;

public class FruitElement implements Element{
    private int pricePerKg;
    private int weight;
    private String name;

    public FruitElement(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() { return pricePerKg; }
    public int getWeight() { return weight; }
    public String getName() { return name; }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

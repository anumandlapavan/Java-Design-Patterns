package _03_BehavioralDesignPatterns._11_VisitorPattern;

public interface Visitor {
    void visit(BookElement book);

    void visit(FruitElement fruit);
}

package _03_BehavioralDesignPatterns._11_VisitorPattern;

public interface Element {
    public void accept(Visitor v);
}

package _03_BehavioralDesignPatterns._11_VisitorPattern;

public class BookElement implements Element{
    private int price;
    private String isbn;

    public BookElement(int price, String isbn) {
        this.price = price;
        this.isbn = isbn;
    }

    public int getPrice() { return price; }
    public String getIsbn() { return isbn; }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

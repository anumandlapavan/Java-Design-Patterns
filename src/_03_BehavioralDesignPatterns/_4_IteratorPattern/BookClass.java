package _03_BehavioralDesignPatterns._4_IteratorPattern;

public class BookClass {
    private final int bookPrice;

    private final String bookName;

    BookClass(String bookName,int bookPrice){
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public String getBookName(){
        return this.bookName;
    }

    public int getBookPrice(){
        return this.bookPrice;
    }
}

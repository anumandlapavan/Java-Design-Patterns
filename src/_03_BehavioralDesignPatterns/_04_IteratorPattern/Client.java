package _03_BehavioralDesignPatterns._04_IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<BookClass> booksList = new ArrayList<>();
        booksList.add(new BookClass("Science",100));
        booksList.add(new BookClass( "Maths",200));
        booksList.add(new BookClass( "GK",300));
        booksList.add(new BookClass( "Drawing",120));

        LibraryCollection libraryCollection = new LibraryCollection(booksList);

        Iterator bookIterator = libraryCollection.createIterator();

        while(bookIterator.hasNext()){
            BookClass book = (BookClass) bookIterator.next();
            System.out.println(book.getBookName());
        }
    }
}

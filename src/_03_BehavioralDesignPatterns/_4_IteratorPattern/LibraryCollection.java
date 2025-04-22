package _03_BehavioralDesignPatterns._4_IteratorPattern;

import java.util.List;

public class LibraryCollection implements Aggregate {
    private final List<BookClass> bookList;

    LibraryCollection(List<BookClass> bookList){
        this.bookList = bookList;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(bookList);
    }
}

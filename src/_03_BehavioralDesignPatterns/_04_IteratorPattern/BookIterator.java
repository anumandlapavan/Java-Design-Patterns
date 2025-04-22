package _03_BehavioralDesignPatterns._04_IteratorPattern;

import java.util.List;

public class BookIterator implements Iterator{

    private final List<BookClass> bookList;
    int index = 0;


    BookIterator(List<BookClass> bookList){
        this.bookList = bookList;
    }
    @Override
    public boolean hasNext() {
        return index < bookList.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return bookList.get(index++);
        }
        return null;
    }
}

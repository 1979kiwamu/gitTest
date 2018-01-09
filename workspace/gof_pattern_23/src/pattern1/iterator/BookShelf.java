package pattern1.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {

//    private Book[] books;
    private List<Book> books;
//    private int last = 0;

    public BookShelf(int maxsize) {
//        this.books = new Book[maxsize];
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
//        return books[index];
        return books.get(index);
    }

    public void appendBook(Book book) {
//        this.books[last] = book;
        this.books.add(book);
//        last++;
    }

    public int getLength() {
//        return last;
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}

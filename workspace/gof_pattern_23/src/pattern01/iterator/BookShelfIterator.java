/**
 *
 */
package pattern01.iterator;

/**
 * @author kiwamu
 *
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /* (非 Javadoc)
     * @see pattern1.iterator.Iterator#hasNext()
     */
    @Override
    public boolean hasNext() {

        if (index < bookShelf.getLength()) {
            return true;
        }
        return false;
    }

    /* (非 Javadoc)
     * @see pattern1.iterator.Iterator#next()
     */
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }

}

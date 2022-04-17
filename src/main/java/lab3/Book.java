package lab3;

import java.io.Serializable;

public class Book extends Publication implements Serializable {
    private String author;

    public Book() {
    }

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + author;
    }

    /**the number of books to order and add to stock.
     * @param numCopies
     */
    public void orderCopies(int numCopies) {
        super.setCopies(super.getCopies() + numCopies);
    }
}

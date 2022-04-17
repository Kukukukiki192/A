package lab4;

import java.io.Serializable;

public class Book extends Publication implements Serializable {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return getTitle() + " by " + author + ". Price: " + getPrice();
    }

    @Override
    public void sellCopy() {
        super.sellCopy();
        System.out.println("Selling a book.");
    }

    public void orderCopies(int numCopies) {
        setCopies(getCopies() + numCopies);
    }

}

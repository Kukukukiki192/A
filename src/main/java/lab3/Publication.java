package lab3;

import java.io.Serializable;

public abstract class Publication implements Serializable {
    private String title;
    private double price;
    private int copies;

    public Publication() {}

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return title;
    }

    public void sellCopy() { //?
        this.copies--;
    }
}

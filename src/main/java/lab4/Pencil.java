package lab4;

public class Pencil implements SaleableItem {
    private int stock = 10;
    private double price = 3.0;

    @Override
    public String toString() {
        return "Pencil{" +
                "stock=" + stock +
                ", price=" + price +
                '}';
    }

    @Override
    public void sellCopy() {
        stock--;
        System.out.println("Selling a pencil.");
    }

    @Override
    public double getPrice() {
        return price;
    }
}

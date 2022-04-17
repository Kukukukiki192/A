package lab4;

public class Ticket implements SaleableItem {
    private double price = 8.9;
    private String description;
    private String client;

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price: " + price;
    }

    @Override
    public void sellCopy() {
        System.out.println("********TICKET VOUCHER********");
        System.out.println(toString());
        System.out.println("******************************");
    }

}

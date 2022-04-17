package lab4;

public class CashTill {
    private double runningTotal = 0;

    public void sellItem(SaleableItem item) {
        runningTotal += item.getPrice();
        item.sellCopy();
    }

    public void showTotal() {
        System.out.println("Total = " + runningTotal);
    }

}

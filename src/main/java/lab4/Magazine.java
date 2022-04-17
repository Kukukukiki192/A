package lab4;

import java.io.Serializable;
import java.util.Date;

public class Magazine extends Publication implements Serializable {
    private int orderQty = 10;
    private Date currIssue;

    @Override
    public String toString() {
        return super.toString() + " (" + currIssue + ")";
    }

    @Override
    public void sellCopy() {
        super.sellCopy();
        System.out.println("Selling a Magazine.");
    }

    public void adjustQty(int n) {
        orderQty = n;
        setCopies(getCopies() + orderQty);
    }

    public void receiveNewIssue(Date newIssue) {
        currIssue = newIssue;
        setCopies(orderQty);
    }

}

package lab3;

import java.io.Serializable;
import java.util.Date;

public class DiscMag extends Magazine implements Serializable {
    public DiscMag() {}

    public DiscMag(String title, double price, int copies, int orderQty, Date currIssue) {
        super(title, price, copies, orderQty, currIssue);
    }

    @Override
    public void receiveNewIssue(Date newIssue) {
        super.receiveNewIssue(newIssue);
        System.out.println("Check that disc is attached.");
    }
}

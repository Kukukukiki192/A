package lab3;

import java.io.Serializable;
import java.util.Date;

public class Magazine extends Publication implements Serializable {
    private int orderQty = 10;
    private Date currIssue;

    public Magazine() {}

    public Magazine(String title, double price, int copies, int orderQty, Date currIssue) {
        super(title, price, copies + orderQty);
        this.orderQty = orderQty;
        this.currIssue = currIssue;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + currIssue + ")";
    }

    /**adjustQty() modifies orderQty to alter how many copies of subsequent issues will be stocked.
     * @param n
     */
    public void adjustQty(int n) {
        this.orderQty = n;
        super.setCopies(super.getCopies() + orderQty);
    }

    /**when a newIssue is received the old are discarded and orderQty copies are placed in stock.
     * Therefore recvNewIssue() sets currIssue to date of new issue and restores copies to orderQty.
     * @param newIssue
     */
    public void receiveNewIssue(Date newIssue) {
        this.currIssue = newIssue;
        super.setCopies(orderQty);
    }
}

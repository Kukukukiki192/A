package lab4;

import java.io.Serializable;
import java.util.Date;

public class DiscMag extends Magazine implements Serializable {
    @Override
    public void receiveNewIssue(Date newIssue) {
        super.receiveNewIssue(newIssue);
        System.out.println("Check that disc is attached.");
    }

    @Override
    public void sellCopy() {
        setCopies(getCopies() - 1);
        System.out.println("Selling a DiscMagazine.");
    }

}

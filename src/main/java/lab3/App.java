package lab3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class App {
    private List<Book> books = new ArrayList<>();
    private List<Magazine> magazines = new ArrayList<>();
    private List<DiscMag> discMags = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private String menu = "-----------------------------\n"
            + "1. Add a Book\n"
            + "2. Edit a Book.\n"
            + "3. Delete a Book\n"
            + "4. Add Magazine\n"
            + "5. List Magazine\n"
            + "6. Add Disc Magazine\n"
            + "7. List Disc Magazine\n"
            + "\n"
            + "8. Quit\n";

    private String getInput(String s) {
        String ss = input.nextLine();
        if (ss.trim().isEmpty()) {
            return s;
        }
        if (ss.trim().equals("q")) {
            System.exit(0);
        }
        Scanner in = new Scanner(ss);
        return in.nextLine();
    }

    private int getInput(int i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        if (s.trim().equals("q")) {
            System.exit(0);
        }
        Scanner in2 = new Scanner(s);
        return in2.nextInt();
    }

    private double getInput(double d) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return d;
        }
        if (s.trim().equals("q")) {
            System.exit(0);
        }
        Scanner in2 = new Scanner(s);
        return in2.nextDouble();
    }

    private void list(int type) {
        if(type==1) {
            System.out.println("------------Books------------");
            if (books.isEmpty()) return;
            int i = 0;
            for (Book book: books) {
                if (book != null) {
                    System.out.println((++i) + ". " + book.toString());
                }
            }
        } else if(type==2) {
            System.out.println("----------Magazines----------");
            if (magazines.isEmpty()) return;
            int i = 0;
            for (Magazine magazine: magazines) {
                if (magazine != null) {
                    System.out.println((++i) + ". " + magazine.toString());
                }
            }
        } else {
            System.out.println("--------Disc Magazines-------");
            if (discMags.isEmpty()) return;
            int i = 0;
            for (DiscMag discMag: discMags) {
                if (discMag != null) {
                    System.out.println((++i) + ". " + discMag.toString());
                }
            }
        }
    }

    private void add(int type) {
        if(type==1) {
            System.out.println("----------Add a Book---------");
            Book book = new Book();
            getInput(null); // Not including this line will skip the first input.
            System.out.println("Enter Author('q' to quit):");
            book.setAuthor(getInput(null));
            System.out.println("Quantity to Order:");
            book.orderCopies(getInput(0));
            System.out.println("Title:");
            book.setTitle(getInput(null));
            System.out.println("Price:");
            book.setPrice(getInput(0.0));
            books.add(book);
        } else if(type==2) {
            System.out.println("----------Add Magazine-------");
            Magazine mag = new Magazine();
            getInput(null);
            mag.setCopies(0);
            System.out.println("Quantity to Order('q' to quit):");
            mag.adjustQty(getInput(0));
            mag.receiveNewIssue(new Date());
            System.out.println("Title:");
            mag.setTitle(getInput(null));
            System.out.println("Price:");
            mag.setPrice(getInput(0.0));
            magazines.add(mag);
        } else {
            System.out.println("-------Add Disc Magazine-----");
            DiscMag discMag = new DiscMag();
            getInput(null);
            discMag.setCopies(0);
            System.out.println("Quantity to Order('q' to quit):");
            discMag.adjustQty(getInput(0));
            discMag.receiveNewIssue(new Date());
            System.out.println("Title:");
            discMag.setTitle(getInput(null));
            System.out.println("Price:");
            discMag.setPrice(getInput(0.0));
            discMags.add(discMag);
        }
    }

    private void edit() {
        if (books.isEmpty()) return;
        System.out.println("Which book would you like to edit?");
        int choice = input.nextInt();
        input = new Scanner(System.in);
        if (choice < books.size()+1 && choice > 0) {
            Book book = books.get(choice - 1);
            System.out.println("Hit enter to use the default value('q' to quit).");
            System.out.println("Author: "+book.getAuthor());
            book.setAuthor(getInput(book.getAuthor()));
            System.out.println("Quantity to Order: "+book.getCopies());
            book.setCopies(getInput(book.getCopies()));
            System.out.println("Title: "+book.getTitle());
            book.setTitle(getInput(book.getTitle()));
            System.out.println("Price: "+book.getPrice());
            book.setPrice(getInput(book.getPrice()));
        } else {
            System.out.println("Choice out of bounds.");
        }
    }

    private void delete() {
        if (books.isEmpty()) return;
        System.out.println("Which book would you like to delete?");
        int choice = input.nextInt();
        input = new Scanner(System.in);
        if ((choice <= books.size()) && choice > 0) {
            books.remove(choice - 1);
        } else {
            System.out.println("Choice out of bounds.");
        }
    }

    public void run() {
        while (true) {
            list(1);
            System.out.println(menu);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    add(1);
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    add(2);
                    break;
                case 5:
                    list(2);
                    break;
                case 6:
                    add(3);
                    break;
                case 7:
                    list(3);
                    break;
                case 8:
                    System.out.println("Bye...");
                    System.exit(0);
                default:
                    System.out.println("Invalid entry, try again…");
            }
        }
    }
}

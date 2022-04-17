package lab4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    private List<Book> books = new ArrayList<>();
    private List<Magazine> magazines = new ArrayList<>();
    private List<DiscMag> discMags = new ArrayList<>();
    private Ticket ticket = new Ticket();
    private Pencil pencil = new Pencil();
    private CashTill till = new CashTill();
    private Scanner input = new Scanner(System.in);
    private String menu =
              "---------Main(Enter another number to exit)---------\n"
            + "1. Books\n"
            + "2. Magazines\n"
            + "3. Tickets\n"
            + "4. Pencils\n"
            + "----------------------------------------------------\n";
    private String bookMenu =
              "-----------------------Books------------------------\n"
            + "1. Add a Book\n"
            + "2. Edit a Book\n"
            + "3. Delete a Book\n"
            + "4. Sell a Book\n"
            + "----------------------------------------------------\n";
    private String mgzMenu =
              "----------------------Magazines---------------------\n"
            + "1. Add a Magazine\n"
            + "2. Add a Disc Magazine\n"
            + "3. Delete a Magazine\n"
            + "4. Delete a Disc Magazine\n"
            + "5. Sell a Magazine\n"
            + "6. Sell a Disc Magazine\n"
            + "----------------------------------------------------\n";
    private String ticketMenu =
              "-----------------------Tickets----------------------\n"
            + "1. Sell a Ticket\n"
            + "----------------------------------------------------\n";
    private String pencilMenu =
            "-----------------------Pencils----------------------\n"
            + "1. Sell a Pencil\n"
            + "----------------------------------------------------\n";


    // getInput()
    private String getInput(String s) {
        String ss = input.nextLine();
        if (ss.trim().isEmpty()) {
            return s;
        }
        if (ss.trim().equals("q")) {
            System.exit(0);
        }
        Scanner in2 = new Scanner(ss);
        return in2.nextLine();
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

    private double getInput(double i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextDouble();
    }


    // CRUD
    private <T> void list(List<T> items) {
        if (items.isEmpty()) return;
        int i = 0;
        for (T item : items) {
            if (item != null) {
                System.out.println((++i) + ". " + item.toString());
            }
        }
        System.out.println("----------------------------------------------------");
    }

    private void add(int type) {
        if (type == 1) {
            System.out.println("---------------------Add a Book---------------------");
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
        } else if (type == 2) {
            System.out.println("--------------------Add a Magazine------------------");
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
            System.out.println("------------------Add a Disc Magazine---------------");
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
        if (books.isEmpty()) {
            System.out.println("There is nothing to edit.");
            return;
        }
        System.out.println("Which one would you like to edit?");
        int choice = input.nextInt();
        input = new Scanner(System.in); // reset the scanner
        if (choice < books.size() + 1 && choice > 0) {
            Book book = books.get(choice - 1);
            System.out.println("Hit enter to use the default value('q' to quit).");
            System.out.println("Author: " + book.getAuthor());
            book.setAuthor(getInput(book.getAuthor()));
            System.out.println("Quantity to Order: " + book.getCopies());
            book.setCopies(getInput(book.getCopies()));
            System.out.println("Title: " + book.getTitle());
            book.setTitle(getInput(book.getTitle()));
            System.out.println("Price: " + book.getPrice());
            book.setPrice(getInput(book.getPrice()));
        } else {
            System.out.println("Choice out of bounds.");
        }
    }

    private <T> void delete(List<T> items) {
        if (items.isEmpty()) {
            System.out.println("There is nothing to delete.");
            return;
        }
        System.out.println("Which one would you like to delete?");
        int choice = input.nextInt();
        input = new Scanner(System.in);
        if ((choice <= items.size()) && choice > 0) {
            items.remove(choice - 1);
        } else {
            System.out.println("Choice out of bounds.");
        }
    }

    private <T> void sell(List<T> items) {
        if (items.isEmpty()) {
            System.out.println("There is nothing to sell.");
            return;
        }
        System.out.println("Which one would you like to sell?");
        int choice = input.nextInt();
        input = new Scanner(System.in);
        if (choice < items.size() + 1 && choice > 0) {
            SaleableItem item = (SaleableItem) items.get(choice - 1);
            till.sellItem(item);
            till.showTotal();
        } else {
            System.out.println("Choice out of bounds.");
        }
    }


    // run
    public void run() {
        while (true) {
            System.out.print(menu);
            int choice = input.nextInt();
            boolean x;
            switch (choice) {
                case 1: {
                    x = true;
                    while (x) {
                        System.out.print(bookMenu);
                        list(books);
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                add(1);
                                break;
                            case 2:
                                edit();
                                break;
                            case 3:
                                delete(books);
                                break;
                            case 4:
                                sell(books);
                                break;
                            default:
                                x = false;
                                break;
                        }
                    }
                    break;
                }
                case 2: {
                    x = true;
                    while (x) {
                        System.out.print(mgzMenu);
                        System.out.println("Magazines:");
                        list(magazines);
                        System.out.println("Disc Magazines:");
                        list(discMags);
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                add(2);
                                break;
                            case 2:
                                add(3);
                                break;
                            case 3:
                                delete(magazines);
                                break;
                            case 4:
                                delete(discMags);
                                break;
                            case 5:
                                sell(magazines);
                                break;
                            case 6:
                                sell(discMags);
                                break;
                            default:
                                x = false;
                                break;
                        }
                    }
                    break;
                }
                case 3: {
                    x = true;
                    while (x) {
                        System.out.print(ticketMenu);
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                till.sellItem(ticket);
                                till.showTotal();
                                break;
                            default:
                                x = false;
                                break;
                        }
                    }
                    break;
                }
                case 4: {
                    x = true;
                    while (x) {
                        System.out.print(pencilMenu);
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                till.sellItem(pencil);
                                till.showTotal();
                                break;
                            default:
                                x = false;
                                break;
                        }
                    }
                    break;
                }
                default:
                    System.out.println("Bye...");
                    System.exit(0);
            }
        }
    }
}
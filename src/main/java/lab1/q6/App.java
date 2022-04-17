package lab1.q6;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private ArrayList<Person> persons=new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private String menu = "------------Menu------------\n"
            + "1. Add a Person\n"
            + "2. List People\n"
            + "3. Delete a Person\n"
            + "99. Exit...";

    private String getInput(String s) {
        String ss = input.nextLine();
        if (ss.trim().isEmpty()) {
            return s;
        }
        Scanner in = new Scanner(ss);
        return in.nextLine();
    }

    private void add() {
        Person p=new Person();
        getInput(null);
        System.out.println("FirstName: ");
        p.setFirstName(getInput(null));
        System.out.println("LastName: ");
        p.setLastName(getInput(null));
        System.out.println("SocialInsuranceNumber: ");
        p.setSocialInsuranceNumber(getInput(null));
        System.out.println("Finished.");
        persons.add(p);
    }

    private void list() {
        if(persons==null || persons.isEmpty()) {
            System.out.println("None.");
            return;
        }
        int i=0;
        for (Person p: persons) {
            if (p != null) {
                System.out.println("No."+(++i)+'\t' + p.toString());
            }
        }
    }

    private void delete() {
        if(persons==null || persons.isEmpty()) {
            System.out.println("No persons can be deleted.");
            return;
        }
        System.out.println("Which person would you like to delete?");
        list();
        int choice = input.nextInt();
        input = new Scanner(System.in);
        if ((choice <= persons.size()) && choice > 0) {
            persons.remove(choice-1);
        } else {
            System.out.println("Choice out of bounds.");
        }
    }

    public void run() {
        boolean quit = false;
        while(!quit) {
            System.out.println(menu);
            System.out.println("Enter choice:");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    list();
                    break;
                case 3:
                    delete();
                    break;
                case 99:
                    System.exit(0);
                default:
                    System.out.println("Invalid entry, try again…");
            }
        }
    }
}

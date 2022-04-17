package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    /**
     * instance variables
     */
    private List<Course> courses = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private String menu = "------------Menu------------\n"
            + "1. Add a Course\n"
            + "2. Edit a course\n"
            + "3. List courses\n";


    //method parameters: s
    private String getInput(String s) {
        String ss = input.nextLine(); //local variables
        if (ss.trim().isEmpty()) {
            return s;
        }
        Scanner in2 = new Scanner(ss); //local variables
        return in2.nextLine();
    }

    //method parameters: i
    private int getInput(int i) {
        String s = input.nextLine(); //local variables
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s); //local variables
        return in2.nextInt();
    }

    private void add() {
        Course c = new Course(); //local variables
        getInput(null);
        System.out.println("name: ");
        c.setName(getInput(null));
        System.out.println("code: ");
        c.setCode(getInput(null));
        System.out.println("startDate: ");
        c.setStartDate(getInput(null));
        System.out.println("numberOfStudents: ");
        c.setNumberOfStudents(getInput(0));
        System.out.println("count: ");
        c.setCount(getInput(0));
        courses.add(c);
    }

    private void edit() {
        list();
        if(courses.size()==0) {
            System.out.println("No courses can be edited.");
            return;
        }
        System.out.println("Which course would you like to edit ?");
        int choice = input.nextInt(); //local variables
        input = new Scanner(System.in);
        System.out.println("Hit enter to use the default.");
        if (choice < courses.size()+1 && choice > 0) {
            Course c = courses.get(choice - 1); //local variables
            System.out.println("name: "+c.getName());
            c.setName(getInput(c.getName()));
            System.out.println("code: "+c.getCode());
            c.setCode(getInput(c.getCode()));
            System.out.println("startDate: "+c.getStartDate());
            c.setStartDate(getInput(c.getStartDate()));
            System.out.println("numberOfStudents: "+c.getNumberOfStudents());
            c.setNumberOfStudents(getInput(c.getNumberOfStudents()));
            System.out.println("count: "+c.getCount());
            c.setCount(getInput(c.getCount()));
        } else {
            System.out.println("Choice out of bounds.");
        }
    }

    private void list() {
        if(courses.size()==0) {
            System.out.println("No courses.");
            return;
        }
        int i = 0; //local variables
        for (Course c: courses) {
            if (c != null) {
                System.out.println(++i);
                System.out.println(c.toString());
            }
        }
    }

    public void run() {
        boolean quit = false; //local variables
        while(!quit) {
            System.out.println(menu);
            System.out.println("Enter a choice:");
            int choice = input.nextInt(); //local variables
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    list();
                    break;
                default:
                    quit = true;
            }
        }
    }
}
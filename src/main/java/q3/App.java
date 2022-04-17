package q3;

import q1.Person;
import q2.Car;

import java.util.Scanner;

public class App {
    private final int numCars = 100;
    private Car[] cars = new Car[numCars];
    private Car[] sold = new Car[numCars];
    private int currentIndex = 0;
    private int soldCurrentIndex = 0;
    private Scanner input = new Scanner(System.in);
    private String menu = "------------Menu------------\n"
            + "1. Add Car\n"
            + "2. List Cars\n"
            + "3. Edit Car\n"
            + "4. Delete Car\n"
            + "5. Sell Car\n"
            + "6. Sold Cars\n"
            + "7. help\n"
            + "8. quit\n";
//    private String soldCarsMenu = ""
//            + "1. List Cars\n";
//            + "99. quit";

    private String getInput(String s) {
        String ss = input.nextLine();
        if (ss.trim().isEmpty()) {
            return s;
        }
        Scanner in2 = new Scanner(ss);
        return in2.nextLine();
    }

    private int getInput(int i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
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

    private void add() {
        System.out.println("Doing '1.Add Car' right now.");
        Car c = new Car();
        getInput(null);//不加这行输入会跳过一行
        System.out.println("Make: ");
        c.setMake(getInput(null));
        System.out.println("Model: ");
        c.setModel(getInput(null));
        System.out.println("Year: ");
        c.setYear(getInput(0));
        System.out.println("VIN: ");
        c.setVin(getInput(0));
        cars[currentIndex++] = c;
    }

    private void list(int type) {
        if (type == 1) {
            System.out.println("Doing '2.List Cars' right now.");
            int i = 0;
            // List all cars
            if(cars[0]==null) {
                System.out.println("No cars.");
                return;
            }
            for (Car car : cars) {
                if (car != null) {
                    System.out.println(++i);
                    System.out.println(car.toString());
                }
            }
        } else {
            System.out.println("Doing '6.Sold Cars' right now.");
            int i = 0;
            // List sold cars and their owners
            if(sold[0]==null) {
                System.out.println("No sold cars.");
                return;
            }
            for (Car car : sold) {
                if (car != null) {
                    System.out.println(++i);
                    System.out.println(car.toString());
                }
            }
        }
    }

    private void edit() {
        System.out.println("Doing '3.Edit Car' right now.");
        list(1);
        if(cars[0]==null) {
            System.out.println("No cars can be edited.");
            return;
        }
        System.out.println("Which car would you like to edit ?:");
        int choice = input.nextInt();
        input = new Scanner(System.in); // reset the scanner
        System.out.println("Hit enter to use the default.");
        if ((choice < currentIndex + 1) && choice > 0) {
            Car c = cars[choice - 1];
            System.out.println("Make: " + c.getMake());
            c.setMake(getInput(c.getMake()));
            System.out.println("Model: " + c.getModel());
            c.setModel(getInput(c.getModel()));
            System.out.println("Year: " + c.getYear());
            c.setYear(getInput(c.getYear()));
        } else {
            System.out.println("Choice out of bounds.");
        }
    }

    private void delete() {
        System.out.println("Doing '4.Delete Car' right now.");
        list(1);
        if(cars[0]==null) {
            System.out.println("No cars can be deleted.");
            return;
        }
        System.out.println("Which car would you like to delete ?:");
        int choice = input.nextInt();
        input = new Scanner(System.in); // reset the scanner
        if ((choice < currentIndex + 1) && choice > 0) {
            while (cars[choice] != null) {
                cars[choice - 1] = cars[choice++];
            }
            cars[choice - 1] = null;
        } else {
            System.out.println("Choice out of bounds.");
        }
    }

    private void sell() {
        System.out.println("Doing '5.Sell Car' right now.");
        list(1);
        if(cars[0]==null) {
            System.out.println("No cars can be sold.");
            return;
        }
        System.out.println("Which car would you like to sell ?:");
        int choice = input.nextInt();
        input = new Scanner(System.in); // reset the scanner
        if ((choice < currentIndex + 1) && choice > 0) {
            Car c = cars[choice - 1];
            System.out.println("Enter the owner's information.");
            Person owner = new Person();
            System.out.println("Name: ");
            owner.setName(getInput(null));
            System.out.println("Type: ");
            owner.setType(getInput(null));
            System.out.println("Age: ");
            owner.setAge(getInput(0));
            System.out.println("height: ");
            owner.setHeight(getInput(0d));
            System.out.println("weight: ");
            owner.setWeight(getInput(0d));
            System.out.println("gender: ");
            owner.setGender(getInput(null).charAt(0));
            c.setOwner(owner);
            sold[soldCurrentIndex++] = c;
        } else {
            System.out.println("Choice out of bounds.");
        }
    }

    private void help() {
        //To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
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
                    list(1);
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    sell();
                    break;
                case 6:
                    list(2);
                    break;
                case 7:
                    help();
                    break;
                case 8:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid entry, try again…");
            }
        }
        System.exit(0);
    }
}
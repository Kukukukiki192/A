package q2;

import q1.Person;

public class App {
    public void run() {
        Person shane = new Person("Shane", "Mollari");
        Car ford = new Car("Ford", "Mustang", 2012);
        Car chev = new Car("Chevrolet", "Camaro", 2012, shane);
        Car ford1 = new Car("Ford", "Focus", 2013, 1234);

        System.out.println(ford);
        System.out.println(chev);
        System.out.println(ford1);

        System.out.println(ford.equals(ford1));
    }
}




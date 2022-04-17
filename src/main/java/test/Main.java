package test;

import org.junit.*;

public class Main {
    public static void main(String[] args) {
        new App().run();
    }

    @Test
    public void isEqual() {
        Course c1 = new Course("Introduction to Java", "CSD211", "01/09/2013", 30, 48);
        Course c2 = new Course("Introduction to Java", "CSD211", "01/09/2015", 88, 64);
        System.out.println(c1.equals(c2));
    }

    @Test
    public void isNotEqual() {
        Course c1 = new Course("Introduction to Java", "CSD211", "01/09/2013", 30, 48);
        Course c2 = new Course("Introduction to C++", "CSD213", "01/09/2015", 88, 64);
        System.out.println(c1.equals(c2));
    }
}

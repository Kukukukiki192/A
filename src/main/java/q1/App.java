package q1;

public class App {
    public void run() {
        // Joe Student is 23 years old and male.
        Person p1 = new Person("Joe", "Student", 23, 'M');

        // George Student is a 24 year old male, is 182.88 cm tall and weighs 60kg.
        Person p2 = new Person("George", "Student", 24, 188.2, 60.0, 'M');

        // Mary Teacher is female, 43 years old, is 170.00 cm tall and weighs 48.2 kg.
        Person p3 = new Person("Mary", "Teacher", 43, 170, 48.2, 'F');
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.equals(p2));
    }
}




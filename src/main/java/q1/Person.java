package q1;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 */
public class Person implements Serializable {
    private String name;
    private String type;
    private int age;
    private double height;
    private double weight;
    private char gender;

    public Person() {
    }

    public Person(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Person(String name, String type, int age, char gender) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, String type, int age, double height, double weight, char gender) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + " " + type + '\n' +
                "Age: " + age + '\n' +
                "Height: " + String.format("%.1f", height) + "cm\n" +
                "Weight: " + String.format("%.1f", weight) + "kg\n" +
                "Gender: " + gender + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.height, height) == 0 && Double.compare(person.weight, weight) == 0 && Objects.equals(name, person.name) && Objects.equals(type, person.type) && Objects.equals(gender, person.gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
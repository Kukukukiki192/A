package q2;

import q1.Person;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String make;
    private String model;
    private int year;
    private Person owner;
    private int vin;

    public Car() {
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make, String model, int year, Person owner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.owner = owner;
    }

    public Car(String make, String model, int year, int vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
    }

    @Override
    public String toString() {
        String s = owner == null ? "" : "Owner: {\n" + owner.toString() + "}\n";
        return  "Make: " + make + '\n' +
                "Model: " + model + '\n' +
                "Year: " + year + '\n' +
                "Vin: " + vin + '\n' + s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && vin == car.vin && Objects.equals(make, car.make) && Objects.equals(model, car.model);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }
}
package test;

import java.util.Objects;

public class Course {
    /**
     * instance variables
     */
    private String name;   //(Ex; Introduction to Java)

    private String code;   //(Ex; CSD211)

    private String startDate;   // (Ex; 01/09/2013)

    private int numberOfStudents;

    private int count;


    public Course() {
    }

    //method parameters: name, code, startDate, numberOfStudents, count
    public Course(String name, String code, String startDate, int numberOfStudents, int count) {
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.numberOfStudents = numberOfStudents;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    //method parameters: name
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    //method parameters: code
    public void setCode(String code) {
        this.code = code;
    }

    public String getStartDate() {
        return startDate;
    }

    //method parameters: startDate
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    //method parameters: numberOfStudents
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getCount() {
        return count;
    }

    //method parameters: count
    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        return "[" + code + ", "+ name + "]\n";
    }

    //method parameters: o
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o; //local variables
        return Objects.equals(code, course.code);
    }

}

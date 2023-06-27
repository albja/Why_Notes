package org.Why_Notes;

public class Student {
    public Student(String lastName, String firstName, double[] grades, double average) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.grades = grades;
        this.average = average;
    }

    private final String lastName;
    private final String firstName;
    private final double[] grades;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public double[] getGrades() {
        return grades;
    }


    public double getAverage() {
        return average;
    }

    private final double average;


}

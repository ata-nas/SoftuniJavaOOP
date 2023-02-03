package softuni.oop.encapsulation.lab;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        validateName(firstName, "First");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateName(lastName, "Last");
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

     public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    private static void validateName(String name, String messagePref) {
        if (name.length() < 3) {
            throw new IllegalArgumentException(messagePref + " name cannot be less than 3 symbols");
        }
    }

    public void increaseSalary(double bonus) {
        double actualBonus = age < 30 ? bonus / 2 : bonus;

        double bonusFactor = 1.00 + actualBonus / 100;

        setSalary(salary * bonusFactor);
    }

    @Override
    public String toString() {
//        return String.format("%s %s is %d years old.",
//                firstName, lastName, age);
        DecimalFormat df = new DecimalFormat("0.0##");
        return String.format("%s %s gets %s leva",
                firstName, lastName, df.format(salary));
    }
}

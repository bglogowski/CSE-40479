/*
 * Employee.java
 */

/**
 *
 * @author Bryan Glogowski
 * @version 1.0
 * 
 */

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary = 0.0;

    // Constructor

    public Employee(String theFirstName, String theLastName, double theMonthlySalary) {

        firstName = theFirstName;
        lastName = theLastName;

        if (theMonthlySalary > 0.0)
            monthlySalary = theMonthlySalary;

    }

    // Accessors

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Mutators

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setMonthlySalary(double newMonthlySalary) {
        if (newMonthlySalary > 0.0) {
            monthlySalary = newMonthlySalary;
        }
    }

}

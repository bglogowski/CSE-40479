/*
 * EmployeeTest.java
 */

/**
 *
 * @author Bryan Glogowski
 * @version 1.0
 * 
 */

public class EmployeeTest {

    public static void main(String args[]) {

        // Create two Employee objects
        Employee employeeOne = new Employee("Benjamin", "Bernanke", 14814.72);
        Employee employeeTwo = new Employee("Paul", "Volcker", 28148.04);

        // Display the employees' info (including yearly salary
        System.out.println(employeeOne.getFirstName() + " " + employeeOne.getLastName() + "'s yearly salary: "
                + employeeOne.getMonthlySalary());

        System.out.println(employeeTwo.getFirstName() + " " + employeeTwo.getLastName() + "'s yearly salary: "
                + employeeTwo.getMonthlySalary());

        System.out.println("Giving raises...");

        // Give each employee a 10% raises.
        employeeOne.setMonthlySalary(employeeOne.getMonthlySalary() * 1.1);
        employeeTwo.setMonthlySalary(employeeTwo.getMonthlySalary() * 1.1);

        // Display the employees' info (including yearly salary)
        System.out.println(employeeOne.getFirstName() + " " + employeeOne.getLastName() + "'s yearly salary: "
                + employeeOne.getMonthlySalary());

        System.out.println(employeeTwo.getFirstName() + " " + employeeTwo.getLastName() + "'s yearly salary: "
                + employeeTwo.getMonthlySalary());

        System.out.println("Attempting to set a negative salary value...");

        // Attempt to set Bernanke's salary to a negative value...
        employeeOne.setMonthlySalary(-1000.0);

        // Display Bernanke's info (including yearly salary)
        System.out.println(employeeOne.getFirstName() + " " + employeeOne.getLastName() + "'s yearly salary: "
                + employeeOne.getMonthlySalary());

    }

}
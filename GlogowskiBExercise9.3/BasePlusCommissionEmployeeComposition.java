/*
 * BasePlusCommissionEmployeeComposition.java
 */

/**
 *
 * @author Bryan Glogowski
 */

public class BasePlusCommissionEmployeeComposition {
    
    private double baseSalary; // base salary per week
    // Demonstrate composition of (as opposed to inheritance from) a CommissionEmployee object
    private CommissionEmployee employee;
    
    // six-argument constructor
    public BasePlusCommissionEmployeeComposition( String first, String last, 
            String ssn, double sales, double rate, double salary) {
        // TODO: implement this constructor
        this.employee = new CommissionEmployee(first, last, ssn, sales, rate);
        setBaseSalary(salary);        
    }
    
    // Implement accessors and mutators for all six attributes (stubs appear below)
    // As per the text (demonstrated in its BasePlusCommissionEmployee implementation), throw an IllegalArgumentException if the salary argument is negative
    public void setBaseSalary( double salary ) {
        if(salary < 0.0) {
            throw new IllegalArgumentException("Base salary must >= 0.0");
        } else {
            this.baseSalary = salary;
        }
        
    }    

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public String getFirstName() {
        return this.employee.getFirstName();
    }

    public String getLastName() {
        return this.employee.getLastName();
    }

    public String getSocialSecurityNumber() {
        return this.employee.getSocialSecurityNumber();
    }

    public double getGrossSales() {
        return this.employee.getGrossSales();
    }

    public void setGrossSales(double sales) {
        this.employee.setGrossSales(sales);
    }

    public double getCommissionRate() {
        return this.employee.getCommissionRate();
    }

    public void setCommissionRate(double rate) {
        this.employee.setCommissionRate(rate);
    }    
    
    public double earnings() {
        return this.baseSalary + this.employee.earnings();
    }
    
    @Override
    public String toString() {        

        return String.format("base-salaried commission employee: %s %s%nsocial security number: %s%ngross sales: %.2f%ncommission rate: %.2f%nbase salary: %.2f%n",
                this.employee.getFirstName(), this.employee.getLastName(), this.employee.getSocialSecurityNumber(), this.employee.getGrossSales(),
                this.employee.getCommissionRate(), this.baseSalary);
        
    }
}
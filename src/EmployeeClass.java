import java.util.Scanner;

public class EmployeeClass {
    Scanner input = new Scanner(System.in);
    private String first, last;
    private double monthlySalary, YearlySalary, YearlySalaryPlusRaise;


    //constructor
    public EmployeeClass(String firstName, String lastName, double monthlySalaryInput) {
        first = firstName;
        last = lastName;

        if (monthlySalaryInput > 0.0) {
            monthlySalary = monthlySalaryInput;
        } else {
            monthlySalary = 0;
        }
        YearlySalary = monthlySalary * 12;
        YearlySalaryPlusRaise = YearlySalary * 1.1;
    }


    public double getMonthlySalary() {
        return monthlySalary;
    }


    public double getYearlySalary() {

        return YearlySalary;
    }

    public double getYearlySalaryPlusRaise() {

        return YearlySalaryPlusRaise;
    }

    public String getFirst() {
        return this.first;
    }

    public String getLast() {
        return this.last;
    }

}

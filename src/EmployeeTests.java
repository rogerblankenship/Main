public class EmployeeTests {
    public static void main(String[] args) {

        Employees employee1 = new Employees("Roger", "Blankenship", 9_000);



        Employees employee2 = new Employees("Shelia", "Blankenship", 1_000);

//displays message about employee1
        System.out.printf("%nFor the employee: %s %s %n$%.2f is their monthly income.%n$%.2f is their yearly income.%n$%.2f is their yearly income with a 10%% raise.%n",
                employee1.getFirst(),
                employee1.getLast(),
                employee1.getMonthlySalary(),
                employee1.getYearlySalary(),
                employee1.getYearlySalaryPlusRaise());
//displays message about employee2
        System.out.printf("%nFor the employee: %s %s %n$%.2f is their monthly income.%n$%.2f is their yearly income.%n$%.2f is their yearly income with a 10%% raise.%n",
                employee2.getFirst(),
                employee2.getLast(),
                employee2.getMonthlySalary(),
                employee2.getYearlySalary(),
                employee2.getYearlySalaryPlusRaise());

    }//End of main
}//End of EmployeeTest

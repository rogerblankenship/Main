import java.util.Scanner;

 public class ClassAverage {
    public static void main(String[] args) {
        // Used for user input
        Scanner input = new Scanner(System.in);
        //Init Vars
        int total = 0;
        int gradeCounter = 1;
        //Loop through for each of the grades.
        while (gradeCounter <= 10) {// loop 10 times
            System.out.print("Enter grade:");
            int grade = input.nextInt(); //input next grade
            total = total + grade; // add grade to total
            gradeCounter = gradeCounter + 1; //increment counter by 1
        }

                //termination phase
                int average = total / 10;
                //display total and average of grades
                System.out.printf("%nTotal of all 10 grades is %d%n", total);
                System.out.printf("Class average is %d%n", average);


            }

        }

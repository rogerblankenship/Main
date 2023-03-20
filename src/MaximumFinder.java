import java.util.Scanner;

//Find the max of three values
public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Enter three floating-point values separated by spaces:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);


        System.out.println("Maximum is: " + result);
        result = minimum(number1, number2, number3);
        System.out.println("Minimum is: " + result);

    } // END main

    private static double minimum(double number1, double number2, double number3) {
        double minVal = number1;

        if (number2 < minVal) {
            minVal = number2;
        }

        if (number3 < minVal) {
            minVal = number3;
        }
        return minVal;
    }

    private static double maximum(double number1, double number2, double number3) {
        double maximumValue = number1;

        if( number2 > maximumValue ){
            maximumValue = number2;

        }

        if(number3 > maximumValue){
            maximumValue = number3;
        }


        return maximumValue;

    } // end maximum
} // End MaximumFinder


import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Track number of integers
        int totalIntegers = 0;

        // Track sum of integers
        int sumOfIntegers = 0;

        while (true) {
            // Request input from the user
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            // Break out of the loop if the input is 0
            if ( input == 0 ) {
                break;
            }

            totalIntegers += 1;
            sumOfIntegers = sumOfIntegers + input;
        }

        // Print total number of integers
        System.out.println("Number of numbers: " + totalIntegers);

        // Print the sum of integers
        System.out.println("Sum of the numbers: " + sumOfIntegers);

    }

}

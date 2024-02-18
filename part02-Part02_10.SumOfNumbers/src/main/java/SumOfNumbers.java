
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Track the sum of integers the user entered
        int sumOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            // Break out of the loop if the input is 0
            if (input == 0) {
                break;
            }
            
            sumOfNumbers += input;
        }

        // Print the sum of integers the user entered
        System.out.println("Sum of the numbers: " +  sumOfNumbers);

    }
}


import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Track the amount of negative user inputs
        int totalNegativeNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());

            // Break out of the loop if the user enters 0
            if (userInput == 0 ) {
                break;
            }

            // If the user enters a negative integer, increment totalNegativeNumbers
            if (userInput < 0){
                totalNegativeNumbers = totalNegativeNumbers + 1;
            }
        }

        // Print the total negative numbers the user entered
        System.out.println("Number of negative numbers: " + totalNegativeNumbers);

    }
}


import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Keep track of the number of user inputs
        int totalNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            // If the user input is 0, break out of the loop
            if (input == 0) {
                break;
            }

            totalNumbers = totalNumbers + 1;
        }

        // print the total number of user inputs
        System.out.println("Number of numbers: " + totalNumbers);

    }
}

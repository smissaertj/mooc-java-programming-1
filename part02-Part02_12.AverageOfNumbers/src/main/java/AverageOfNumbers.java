
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Track the number of user inputs
        int totalUserInput = 0;

        // Calculate the sum of the integers the user entered
        double sumUserInput = 0;

        while (true) {
            // Ask the user for an integer
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            totalUserInput += 1;
            sumUserInput = sumUserInput + input;
        }

        double averageInput = sumUserInput / totalUserInput;
        System.out.println("Average of the numbers: " + averageInput);

    }
}

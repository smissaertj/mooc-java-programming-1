
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Track the amount of user inputs
        int count = 0;

        // Sum of all total positive numbers;
        double sum = 0;

        while (true) {
            // Register the user input
            double input = Double.valueOf(scanner.nextLine());

            // Break out of the loop if the user enters 0;
            if (input == 0) {
                break;
            }

            // Increment count and calculate sum if input is positive
            if (input > 0) {
                count++;
                sum += input;
            }
        }

        // if count = 0, we can't calculate the average
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
        // Calculate the average
            double average = sum / count;
            System.out.println(average);
        }
    }
}

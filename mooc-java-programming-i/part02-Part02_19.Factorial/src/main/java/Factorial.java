
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the user input from STDIN
        System.out.println("Give a numer:");
        int input = Integer.valueOf(scanner.nextLine());

        // Keep track of the factorial
        int factorial = 1;

        // Calculate the factorial
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);

    }
}

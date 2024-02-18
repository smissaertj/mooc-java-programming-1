
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the user input from STDIN
        int input = Integer.valueOf(scanner.nextLine());

        // Keep track of the sum
        int sum = 0;

        for (int i = 0; i <= input; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);

    }
}

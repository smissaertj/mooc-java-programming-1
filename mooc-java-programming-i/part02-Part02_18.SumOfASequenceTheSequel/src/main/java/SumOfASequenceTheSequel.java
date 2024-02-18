
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first number from STDIN
        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());

        // Read the last number from STDIN
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());

        // Keep track of the sum
        int sum = 0;

        // Calculate the sum the closed interval
        for (; first <= last; first++) {
            sum += first;
        }

        System.out.println("The sum is: " + sum);
    }
}

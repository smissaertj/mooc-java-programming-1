
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from STDIN
        int input = Integer.valueOf(scanner.nextLine());

        for(; input <= 100; input++){
            System.out.println(input);
        }
    }
}

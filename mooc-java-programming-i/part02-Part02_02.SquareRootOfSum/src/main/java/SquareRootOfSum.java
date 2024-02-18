
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide first value:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Provide second value:");
        int second = Integer.valueOf(scanner.nextLine());

        double result = Math.sqrt(first + second);

        System.out.println(result);
    }
}

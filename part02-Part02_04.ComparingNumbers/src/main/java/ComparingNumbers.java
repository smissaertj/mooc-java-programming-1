
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Provide second number:");
        int second = Integer.valueOf(scanner.nextLine());

        if ( first < second ){
            System.out.println(first + " is smaller than " + second);
        } else if (first > second) {
            System.out.println(first + " is greater than " + second);
        } else {
            System.out.println(first + " is equal to " + second);
        }

    }
}

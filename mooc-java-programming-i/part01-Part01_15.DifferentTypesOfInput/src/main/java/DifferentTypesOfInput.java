
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String str = scanner.nextLine();
        
        System.out.println("Give an integer:");
        int myInt = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double dbl = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + myInt);
        System.out.println("You gave the double " + dbl);
        System.out.println("You gave the boolean " + bool);

    }
}

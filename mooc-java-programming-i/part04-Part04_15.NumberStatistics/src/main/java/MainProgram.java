
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics sumAllNumbers = new Statistics();
        Statistics sumEvenNumbers = new Statistics();
        Statistics sumOddNumbers = new Statistics();

        System.out.println("Enter numbers:");
        while (true){
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1){
                break;
            }

            if(input % 2 == 0){
                sumEvenNumbers.addNumber(input);
            } else {
                sumOddNumbers.addNumber(input);
            }

            sumAllNumbers.addNumber(input);
        }

        System.out.println("Sum:"+ sumAllNumbers.sum());
        System.out.println("Sum of even numbers:" + sumEvenNumbers.sum());
        System.out.println("Sum of odd numbers:" + sumOddNumbers.sum());
    }
}

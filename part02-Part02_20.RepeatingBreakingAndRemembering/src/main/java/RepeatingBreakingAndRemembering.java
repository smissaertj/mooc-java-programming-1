
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        // Read integers from STDIN
        System.out.println("Give numbers:");
        int input = 0;

        // Keep track of the number of inputs given
        int count = 0;

        // Keep track of the sum of the input
        int sum = 0;

        // Track even input
        int evenNumbers = 0;

        // Track odd input
        int oddNumbers = 0;

        while (true){
            input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }

            if (input % 2 == 0){
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            
            sum += input;
            count++;
        }

        // Calculate the average of inputs given
        double average = (double)sum / (double)count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}

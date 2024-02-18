
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999){
                break;
            }

            list.add(input);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        int smallestNumber = list.get(0);
        for (int i = 0; i < list.size(); i++){
            int number = list.get(i);
            if (smallestNumber > number){
                smallestNumber = number;
            }
        }
        System.out.println("Smallest number: " + smallestNumber);

        // Look for the index(es) of the smalles number
        for (int i = 0; i < list.size(); i++){
            if (smallestNumber == list.get(i)){
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}

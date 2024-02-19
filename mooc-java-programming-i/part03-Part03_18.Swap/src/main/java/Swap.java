
import java.util.ArrayList;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them

        ArrayList<Integer> indices = new ArrayList<>();
        System.out.println("Give two indices to swap:");
        for(int i = 0; i < 2; i++){
            indices.add(Integer.valueOf(scanner.nextLine()));
        }

        int temporaryValueHolder = array[indices.get(0)];
        array[indices.get(0)] = array[indices.get(1)];
        array[indices.get(1)] = temporaryValueHolder;

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}

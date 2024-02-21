
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if(input.equals("")){
                break;
            }

            String[] splitInput = input.split(",");
            ages.add(Integer.valueOf(splitInput[1]));
        }

        int oldest = 0;
        for(int i = 0; i < ages.size(); i++){
            if(ages.get(i) > oldest){
                oldest = ages.get(i);
            }
        }

        System.out.println("Age of the oldest: " + oldest);

    }
}

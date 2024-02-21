
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();

            if(input.equals("")){
                break;
            }

            String[] splitInput = input.split(",");
            names.add(splitInput[0]);
            ages.add(Integer.valueOf(splitInput[1]));
        }

        int oldest = 0;
        int indexOldest = 0;
        for (int i = 0; i < ages.size(); i++){
            if(ages.get(i) > oldest){
                oldest = ages.get(i);
                indexOldest = i;
            }
        }

        System.out.println("Name of the oldest: " + names.get(indexOldest));

    }
}

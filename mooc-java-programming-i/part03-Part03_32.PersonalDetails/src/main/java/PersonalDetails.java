
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();

            if(input.equals("")){
                break;
            }

            String[] splitInput = input.split(",");
            names.add(splitInput[0]);
            years.add(Integer.valueOf(splitInput[1]));
        }

        // Calculate the average of the birth years        
        int sumOfYears = 0;
        for(int year : years){
            sumOfYears += year;
        }
        
        double averageOfYears = (double) sumOfYears / years.size();

        // Check for the longest name 
        String longestName = "";
        int longestNameLength = 0;

        for(String name : names){
            if(name.length() > longestNameLength){
                longestNameLength = name.length();
                longestName = name;
            }
        }

        // Print the output to stdout
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageOfYears);

    }
}

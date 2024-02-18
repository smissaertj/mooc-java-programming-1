
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the starting point from STDIN
        System.out.println("Where to??");
        int end = Integer.valueOf(scanner.nextLine());

        // Read the end point from STDIN
        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.nextLine());

        for(; start <= end; start++){
            System.out.println(start);
        }
    }
}

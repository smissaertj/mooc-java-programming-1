
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        String[] alex = {"alex", "sunshine"};
        String[] emma = {"emma", "haskell"};

        System.out.println("Enter username:");
        String userName = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if(userName.equals(alex[0]) && password.equals(alex[1]) || userName.equals(emma[0]) && password.equals(emma[1])){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}

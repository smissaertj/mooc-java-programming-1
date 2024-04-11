
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {

            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            // Split the user input into a command and a value
            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // Ignore negative values for the amount
            if (amount <= 0){
                amount = 0;
            }

            if (cmd.equals("add")){
                first.add(amount);
            }

            if (cmd.equals("move")){
                if (amount > first.contains()){
                    second.add(first.contains());
                    first.remove(first.contains());
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
            }

            if (cmd.equals("remove")){
                second.remove(amount);
            }
        }

        scan.close();
    }
}

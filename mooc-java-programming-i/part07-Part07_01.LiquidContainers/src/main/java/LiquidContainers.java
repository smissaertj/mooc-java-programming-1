import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int maxAmount = 100;

        while (true) {
            System.out.println("First: " + first + "/" + maxAmount);
            System.out.println("Second: " + second + "/" + maxAmount);
            // System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            // Split the user input into a command and a value
            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // Ignore negative values for the amount
            if (amount < 0){
                amount = 0;
            }

            if (cmd.equals("add")){
                first += amount;
                if (first > maxAmount){
                    first = maxAmount;
                }
            }

            if (cmd.equals("move")){
                if (first >= amount) {
                    first -= amount;
                    second += amount;
                } else {
                    second += first;
                    first = 0;
                }
                if (second > maxAmount) {
                    second = maxAmount;
                }
            }

            if (cmd.equals("remove")){
                second -= amount;
                if (second < 0){
                    second = 0;
                }
            }
        }
    }
}

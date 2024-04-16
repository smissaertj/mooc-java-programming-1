
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdManager birdManager = new BirdManager(scan);

        // User Interface
        while (true){
            System.out.print("? ");
            String cmd = scan.nextLine();

            if (cmd.equals("Quit")){
                break;
            }

            if (cmd.equals("Add")){
                birdManager.add();
            }

            if (cmd.equals("All")){
                birdManager.printAll();
            }

            if (cmd.equals("One")){
                birdManager.printOne();
            }

            if (cmd.equals("Observation")){
                birdManager.incrementObservation();
            }

        }
        // End User Interface

        scan.close();

    }

}

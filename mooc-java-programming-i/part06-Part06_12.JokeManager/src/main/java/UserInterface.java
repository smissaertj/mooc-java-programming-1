import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop ");
            String cmd = scanner.nextLine();

            if (cmd.equals("X")){
                break;
            }

            processCommand(cmd);
        }
    }

    public void processCommand(String cmd){
        if (cmd.equals("1")){
            System.out.println("Write the joke to be added:");
            String joke = scanner.nextLine();
            manager.addJoke(joke);
        }

        if (cmd.equals("2")){
            System.out.println(manager.drawJoke());
        }

        if (cmd.equals("3")){
            manager.printJokes();
        }
    }


}

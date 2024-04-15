import java.util.Scanner;
public class UserInterface {

    private Scanner scanner;
    private String[] commands;
    private String fileName;
    private String cmd;

    public UserInterface(Scanner scanner){
        this.commands = new String[] {
            "list - lists the recipes",
            "stop - stops the program",
            "find name - searches recipes by name",
            "find cooking time - searches recipes by cooking time",
            "find ingredient - searches recipes by ingredient"
        };
        this.scanner = scanner;
    }

    public void printCommands(){
        System.out.println("\nCommands:");
        for (String cmd: commands){
            System.out.println(cmd);
        }
    }   

    public String getFileName(){
        System.out.print("File to read: ");
        this.fileName = scanner.nextLine();
        return this.fileName;
    }

    public String getCommand(){
        System.out.print("\nEnter command: ");
        this.cmd = scanner.nextLine();
        return this.cmd;
    }
}

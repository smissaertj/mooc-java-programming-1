import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict){
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String cmd = scanner.nextLine();

            if (cmd.equals("end")){
                break;
            }

            this.processCommand(cmd);
            System.out.println("");
        }

        System.out.println("Bye bye!");
    }

    public void processCommand(String cmd){
        if (cmd.equals("add")) {
            this.add();

        } else if (cmd.equals("search")){
            this.search();

        } else {
            System.out.println("Unknown command");
        }
    }

    public void add(){
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        this.dict.add(word, translation);
    }

    public void search(){
        System.out.print("To be translated: ");
        String word = scanner.nextLine();

        if (this.dict.translate(word) ==  null){
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + this.dict.translate(word));
        }
    }
}

import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String cmd = scanner.nextLine();

            if (cmd.equals("stop")){
                break;
            }

            processCommand(cmd);
        }
    }

    public void processCommand(String cmd){
        if (cmd.equals("add")){
            System.out.print("To add: ");
            String task = scanner.nextLine();
            this.todoList.add(task);
        }

        if (cmd.equals("list")){
            this.todoList.print();
        }

        if (cmd.equals("remove")){
            System.out.print("Which one is removed? ");
            this.todoList.remove(Integer.valueOf(scanner.nextLine()));
        }
    }
}

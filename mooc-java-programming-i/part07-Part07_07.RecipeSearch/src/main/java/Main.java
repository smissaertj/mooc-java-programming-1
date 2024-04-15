import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create the Scanner object once and pass it to the other classes
        
        UserInterface ui = new UserInterface(scanner);
        String fileName = ui.getFileName();

        while (true){
            ui.printCommands();
            String cmd = ui.getCommand();
            if(cmd.equals("stop")){
                break;
            }

            RecipeReader recipeReader = new RecipeReader(fileName);
            recipeReader.read();

            RecipeSearch recipes = new RecipeSearch(recipeReader.getRecipes(), scanner);
            if (cmd.equals("list")){ recipes.list(); }
            if (cmd.equals("find name")){ recipes.findName(); }
            if (cmd.equals("find cooking time")){ recipes.findTime(); }
            if (cmd.equals("find ingredient")){ recipes.findIngredient(); }
        }

        scanner.close();
    }

}

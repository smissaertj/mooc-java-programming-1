import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    private ArrayList<ArrayList<String>> recipes;
    private Scanner scanner;

    public RecipeSearch(ArrayList<ArrayList<String>> recipes, Scanner scanner){
        this.recipes = recipes;
        this.scanner = scanner;
    }

    public void list(){
        System.out.println("\nRecipes:");
        for (ArrayList<String> recipe: recipes){
            String name = recipe.get(0);
            String time = recipe.get(1);
            System.out.println(name + ", cooking time: " + time);
        }
    }

    public void findName(){
        System.out.print("Searched word: ");
        String search = scanner.nextLine();
        System.out.println("\nRecipes:");
        for (ArrayList<String> recipe: recipes){
            String name = recipe.get(0);
            String time = recipe.get(1);
            if (name.contains(search)){
                System.out.println(name + ", cooking time: " + time);
            }
        }
    }

    public void findTime(){
        System.out.print("Max cooking time: ");
        int search = Integer.valueOf(scanner.nextLine());
        System.out.println("\nRecipes:");
        for (ArrayList<String> recipe: recipes){
            String name = recipe.get(0);
            int time = Integer.valueOf(recipe.get(1));
            if (time <= search){
                System.out.println(name + ", cooking time: " + time);
            }
        }
    }

    public void findIngredient(){
        System.out.print("Ingredient: ");
        String search = scanner.nextLine();
        System.out.println("\nRecipes:");
        for (ArrayList<String> recipe: recipes){
            ArrayList<String> ingredients = new ArrayList<>();
            String name = recipe.get(0);
            String time = recipe.get(1);

            for (int i = 2; i < recipe.size(); i++){
                ingredients.add(recipe.get(i));
            }

            if (ingredients.contains(search)){
                System.out.println(name + ", cooking time: " + time);
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeReader {
    
    private String fileName;
    ArrayList<ArrayList<String>> recipes;

    public RecipeReader(String fileName){
        this.fileName = fileName;
        this.recipes = new ArrayList<>();
    }

    public void read(){
        try (Scanner fileScanner = new Scanner(Paths.get(this.fileName))){
            ArrayList<String> recipe = new ArrayList<>();

            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();

                if (line.isEmpty()){
                    this.recipes.add(recipe);
                    recipe = new ArrayList<>();
                    continue;
                }

                recipe.add(line);
            }

            // Add the last recipe if the file doesn't end with an empty line
            if (!recipe.isEmpty()) {
                recipes.add(recipe);
            }

            fileScanner.close();

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<ArrayList<String>> getRecipes(){
        return this.recipes;
    }
}

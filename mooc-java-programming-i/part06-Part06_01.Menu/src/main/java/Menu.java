
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if (!(this.meals.contains(meal))){
            this.meals.add(meal);
        }
    }

    public void removeMeal(String meal){
        if (this.meals.contains(meal)){
            this.meals.remove(meal);
        }
    }

    public void printMeals(){
        if (this.meals.size() > 0){
           for (String meal: meals){
            System.out.println(meal);
           } 
        }
    }

    public void clearMenu(){
        if (this.meals.size() > 0){
            this.meals.clear();
        }
    }
}

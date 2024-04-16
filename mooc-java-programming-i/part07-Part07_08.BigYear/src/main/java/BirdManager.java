import java.util.Scanner;
import java.util.HashMap;

public class BirdManager {

    private HashMap<Bird, Integer> birds; // Bird Object, Observation Count
    private Scanner scanner;

    public BirdManager(Scanner scanner){
        this.birds = new HashMap<>();
        this.scanner = scanner;
    }


    public void add(){
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();

        Bird bird = search(name);

        if(!isBird(bird)){
            Bird newBird = new Bird(name, latinName);
            this.birds.put(newBird, 0);
        }
    }


    public void incrementObservation(){
        System.out.print("Bird? ");
        String name = scanner.nextLine();

        Bird bird = search(name);

        if (isBird(bird)){
            birds.put(bird, birds.get(bird) + 1);
        } else {
            System.out.println("Not a bird!");
        }
    }


    public void printOne(){
        System.out.print("Bird? ");
        String name = scanner.nextLine();

        Bird bird = this.search(name);

        if (isBird(bird)){
            System.out.println(bird.getName() + " (" + bird.getLatinName() + ") : " + birds.get(bird) + " observations");
        }
    }


    public void printAll(){
        for (Bird bird: birds.keySet()){
            System.out.println(bird.getName() + " (" + bird.getLatinName() + ") : " + birds.get(bird) + " observations");
        }
    }


    public boolean isBird(Object obj){
        if (obj instanceof Bird){
            return true;
        }
        return false;
    }


    public Bird search(String name){
        Bird resultBird = null;

        for (Bird bird: birds.keySet()){
            if (bird.getName().equals(name)){
                resultBird = bird;
            }
        }

        return resultBird;
    }
}
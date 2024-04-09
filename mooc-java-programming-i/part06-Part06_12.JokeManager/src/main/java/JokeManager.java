import java.util.ArrayList;
import java.util.Random;


public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String strJoke){
        this.jokes.add(strJoke);
    }

    public void printJokes(){
        if (!this.jokes.isEmpty()){
            for (String strJoke: jokes){
                System.out.println(strJoke);
            }
        }
    }

    public String drawJoke(){
        if (this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        }

        int index = new Random().nextInt(jokes.size());
        return jokes.get(index);
    }


}

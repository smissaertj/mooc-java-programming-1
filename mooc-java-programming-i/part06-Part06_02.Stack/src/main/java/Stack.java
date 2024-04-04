import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> items;

    public Stack(){
        this.items = new ArrayList<>();
    }

    public boolean isEmpty(){
        return this.items.isEmpty();
    }

    public void add(String item){
        this.items.add(item);
    }

    public ArrayList values(){
        return this.items;
    }

    public String take(){
        String lastElement =  this.items.get(this.items.size() - 1);
        this.items.remove(lastElement);
        return lastElement;
    }
}

import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> taskList;
    
    public TodoList(){
        this.taskList = new ArrayList<>();
    }

    public void add(String task){
        this.taskList.add(task);
    }

    public void remove(int num){
        this.taskList.remove(num - 1);
    }

    public void print(){
        for (int i = 0; i < this.taskList.size(); i++){
            System.out.println(i + 1 + ": " + taskList.get(i));
        }
    }
}
import java.util.ArrayList;

public class PointManager {
    private ArrayList<Integer> points;

    public PointManager(){
        this.points = new ArrayList<>();
    }

    public void add(int point){
        if(this.isValidPoint(point)){
            points.add(point);
        }
    }

    public boolean isValidPoint(int point){
        return point > 0 && point < 100;
    }

    public void printPoints(){
        if(!this.points.isEmpty()){
            for (int point: points){
                System.out.println(point);
            }
        }
    }

    public ArrayList<Integer> getPoints(){
        return this.points;
    }
}

import java.util.ArrayList;
import java.util.HashMap;

public class StatisticCalculator {
    private ArrayList<Integer> points;
    private int passLimit;

    public StatisticCalculator(ArrayList<Integer> points){
        this.points = points;
        this.passLimit = 50;
    }

    public double calculateAverage(){
        double sum = 0;
        
        for (int point: this.points){
            sum += point;
        }

        return sum / this.points.size(); 
    }

    public double calculatePassingAverage(){
        double sum = 0;
        int count = 0;

        for (int point: this.points){
            if (point >= 50){
                sum += point;
                count++;
            }
        }

        if (count == 0){
            return Double.NaN;
        }

        return sum / count;
    } 

    public double calculatePassingPercentage(){
        int passCount = 0;

        for (int point: points){
            if (point >= passLimit){
                passCount++;
            }
        }

        return (double) 100 * passCount / this.points.size();
    } 

    public HashMap<Integer, Integer> calculateGradeDistribution(){
        HashMap<Integer, Integer> grades = new HashMap<>();

        int grade = 0;
        for (int point : this.points) {
            if (point < 50) {
                grade = 0;
            } else if (point < 60) {
                grade = 1;
            } else if (point < 70){
                grade = 2; 
            } else if (point < 80){
                grade = 3; 
            } else if (point < 90){
                grade = 4; 
            } else {
                grade = 5;
            }
    
            // Populate the grades dictionary, set a default value of zero if the grade doesn't exist
            // else, increment the value
            grades.put(grade, grades.getOrDefault(grade, 0) + 1);
        }

        return grades;
    }

}
import java.util.HashMap;

public class ResultPrinter {

    public void average(double average){
        System.out.println("Point average (all): " + average);
    }

    public void averagePassing(double average){
        System.out.println("Point average (passing): " + average);
    }

    public void percentagePassing(double percentage){
        System.out.println("Pass percentage: " + percentage);
    }

    public void gradeDistribution(HashMap<Integer, Integer> grades){
        System.out.println("Grade distribution:");
        for (int grade = 5; grade >= 0; grade--) {
            int count = grades.getOrDefault(grade, 0);
            System.out.print(grade + ": ");
            while (count > 0) {
                System.out.print("*");
                count--;
            }
            System.out.println(); // Add newline after printing stars for each grade
        }
    }
}

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private PointManager points;
    
    public UserInterface(){
        this.scanner = new Scanner(System.in);
        this.points = new PointManager();
    }

    public void start(){
        System.out.println("Enter point totals, -1 stops:");

        while(true){

            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1){
                break;
            }

            points.add(point);

        }

        StatisticCalculator stats = new StatisticCalculator(this.points.getPoints());
        ResultPrinter print = new ResultPrinter();

        print.average(stats.calculateAverage());
        print.averagePassing(stats.calculatePassingAverage());
        print.percentagePassing(stats.calculatePassingPercentage());
        print.gradeDistribution(stats.calculateGradeDistribution());

        scanner.close();
    }
}

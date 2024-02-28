import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();

            if (name.isEmpty()){
                break;
            }

            System.out.println("Duration:");
            Integer duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(name, duration));

        }

        System.out.println("Program's maximum duration?");
        int maxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram program: programs){
            if (program.getDuration() <= maxDuration){
                System.out.println(program);
            }
        }

    }
}

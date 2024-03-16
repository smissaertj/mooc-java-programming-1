
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        ArrayList<String> games = new ArrayList<>();
        int winCounter = 0;
        int lossCounter = 0;
        

        try(Scanner fileReader = new Scanner(Paths.get(file))){

            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                if(homeTeam.equals(team) || visitingTeam.equals(team)){
                    games.add(team);

                    if( (homeTeam.equals(team) && homePoints > visitingPoints) || (visitingTeam.equals(team) && visitingPoints > homePoints) ){
                        winCounter++;
                    } else {
                        lossCounter++;
                    }
                }
            }

            System.out.println("Games: " + games.size());
            System.out.println("Wins: " + winCounter);
            System.out.println("Losses: " + lossCounter);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}

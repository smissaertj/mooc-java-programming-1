
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> wordList = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                wordList.add(line);
            }

            while(true){
                if(searchedFor.isEmpty()){
                    break;
                }

                if(wordList.contains(searchedFor)){
                    System.out.println("Found!");
                    break;
                } else {
                    System.out.println("Not found.");
                    break;
                }
            }
        } catch (Exception e){
            System.out.println("Reading the file " +  file + " failed.");
        }

    }
}

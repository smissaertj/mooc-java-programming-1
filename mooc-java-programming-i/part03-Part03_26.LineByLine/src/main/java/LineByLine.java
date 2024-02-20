
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.isEmpty()){
                break;
            }
            input += line + " ";
        }

        if(input.length() == 0 ){
            System.exit(1);
        }

        String[] splitInput = input.split(" ");
        for (int i = 0; i < splitInput.length; i++){
            System.out.println(splitInput[i]);
        }


    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("First Name:");
            String firstName = scanner.nextLine();

            // Break out of the loop if the firsName is empty
            if (firstName.isEmpty()){
                break;
            }

            System.out.println("Last Name:");
            String lastName = scanner.nextLine();

            System.out.println("Identification number:");
            String idNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }

        for (PersonalInformation info: infoCollection){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}

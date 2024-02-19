
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here

        int stars = 0;
        for (int i = 0; i < array.length; i++){
            stars = array[i];
            for (int j = 0; j < stars; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}

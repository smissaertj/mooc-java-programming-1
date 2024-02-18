public class AdvancedAstrology {

    public static void printStars(int stars) {
        while(stars > 0){
            System.out.print("*");
            stars--;
        }
        System.out.println("");
    }

    public static void printSpaces(int spaces) {
        while(spaces > 0){
            System.out.print(" ");
            --spaces;
        }
    }

    public static void printTriangle(int size) {
        int stars = 0;
        while(size > 0){
            printSpaces(--size);
            printStars(++stars);
        }
    }

    public static void christmasTree(int height) {
        int stars = 1; // Starting with one star

        // Tree Crown
        for(int i = height - 1; i >= 0; i--){
            printSpaces(i);
            printStars(stars);
            stars += 2; // Increment by 2 for the next row
        }

        // Tree Trunk
        for(int i = 0; i < 2; i++){
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

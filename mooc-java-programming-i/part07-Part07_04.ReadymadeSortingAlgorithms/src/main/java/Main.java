import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] strArray = {"Omega", "Beta", "Alpha"};
        ArrayList<Integer> listArrInt = new ArrayList<>();
        ArrayList<String> listArrStr = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            Random random = new Random();
            int randomInt = random.nextInt(11);
            listArrInt.add(randomInt);
        }

        for (String str: strArray){
            listArrStr.add(str);
        }

        sort(array);
        sort(strArray);
        sortIntegers(listArrInt);
        sortStrings(listArrStr);
    }

    public static void sort(int[] array ){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
        System.out.println(integers);
    }

    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
        System.out.println(strings);
    }

}

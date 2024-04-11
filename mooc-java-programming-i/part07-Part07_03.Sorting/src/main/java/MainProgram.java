import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }


    public static int smallest(int[] numbers){

        int smallest = numbers[0];

        for (int i: numbers){
            if ( i < smallest){
                smallest = i;
            }
        }

        return smallest;
    }


    public static int indexOfSmallest(int[] numbers){
        int index = 0;

        for (int i = 0; i < numbers.length - 1; i++){
            if (numbers[i] < numbers[index]){
                index = i;
            }
        }

        return index;
    }


    public static int indexOfSmallestFrom(int[] numbers, int startIndex) {
        int indexOfSmallest = startIndex; // Initialize with startIndex
    
        for (int i = startIndex + 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[indexOfSmallest]) {
                indexOfSmallest = i; // Update indexOfSmallest to store the index of the smallest element
            }
        }
    
        return indexOfSmallest;
    }


    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfSmallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }
            swap(array, i, indexOfSmallest);
            System.out.println(Arrays.toString(array));
        }
    }
}

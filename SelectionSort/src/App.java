import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[] arr = { 4, 86, 2, 18, 34, 6984, 1, 35, 3842, 83, 4, 86, 5 };
        sort(arr);

    }
    // Divide into three different pieces/methods
    // Index of the Smallest starting at a specified index
    // Swap operation
    // Sort operation

    public static int indexOfSmallest(int[] arr, int indexFrom) {
        int index = 0;
        int temp = 999999;

        for (int i = indexFrom; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
                index = i;
            }
        }
        return index;

    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, indexOfSmallest(arr, i));
            // print to see progress after each swap
            System.out.println(Arrays.toString(arr));
        }
    }

}

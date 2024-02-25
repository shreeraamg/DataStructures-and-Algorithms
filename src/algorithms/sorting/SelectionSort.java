package algorithms.sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 6, 2, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int max = 0;
            for(int j=1; j<arr.length-i; j++) {
                if(arr[j] > arr[max])
                    max = j;
            }
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[max];
            arr[max] = temp;
        }
    }
}

import java.util.Arrays;
import java.util.Collections;

public class _18p8_inbuiltSort {
    public static void printArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArrays(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 1, 4, 9, 7, 6, 2, 3 };
        Arrays.sort(arr);
        printArrays(arr);
        int arr2[] = { 5, 7, 3, 9, 1, 8, 2, 4, 6 };
        Arrays.sort(arr2, 0, 5);
        printArrays(arr2);
        Integer arr3[] = { 7, 4, 8, 1, 9, 5, 3, 2, 6 };
        Arrays.sort(arr3, Collections.reverseOrder());
        printArrays(arr3);
        Integer arr4[] = { 6, 4, 9, 1, 7, 3, 8, 2, 5 };
        Arrays.sort(arr4, 1, 6);
        printArrays(arr4);
    }
}
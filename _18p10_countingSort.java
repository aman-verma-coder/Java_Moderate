public class _18p10_countingSort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 5, 15, 8, 5, 6, 3, 200, 5, 3600, 11, 7, 32, 5, 4, 7,
                8, 9, 28, 8, 7, 5, 6, 6, 9, 8, 34, 8, 2, 9, 8, 31, 6, 5, 6, 8, };
        countingSort(arr);
        printArray(arr);
        // System.out.println(arr.length);
    }
}
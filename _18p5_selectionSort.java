public class _18p5_selectionSort {
    public static void ascendSelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPosition = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minPosition] < arr[j]) {
                    minPosition = j;
                }
            }
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void descendSelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPosition = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minPosition] > arr[j]) {
                    minPosition = j;
                }
            }
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 8, 2, 4, 6, 9, 1, 7, 3, 5 };
        ascendSelectionSort(arr);
        printArray(arr);
        descendSelectionSort(arr);
        printArray(arr);
    }
}
public class _18p11_AssignmentQs {
    public static void descendBubbleSorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void descendSelectionSort(int arr[]) {
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

    public static void descendinsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void descendcountingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = count.length - 1; i > 0; i--) {
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
        System.out.println("Bubble Sort");
        int arr1[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        descendBubbleSorting(arr1);
        printArray(arr1);
        System.out.println("Selection Sort");
        int arr2[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        descendSelectionSort(arr2);
        printArray(arr2);
        System.out.println("Insertion Sort");
        int arr3[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        descendinsertionSort(arr3);
        printArray(arr3);
        System.out.println("Counting Sort");
        int arr4[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        descendcountingSort(arr4);
        printArray(arr4);
    }
}

public class _20p11_practiceQs2 {
    public static void printSum2ndRow(int arr[][], int idx) {
        int sum = 0;
        for (int i = 0; i < arr[idx].length; i++) {
            sum += arr[idx][i];
        }
        System.out.println("Sum of row at index " + idx + " is " + sum);
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int row = 2;
        int idx = row - 1;
        printSum2ndRow(nums, idx);
    }
}

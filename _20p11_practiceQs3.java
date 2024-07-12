public class _20p11_practiceQs3 {
    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int row = arr.length;
        int col = arr[0].length;
        System.out.println("Original Array");
        print(arr);
        int[][] transpose = new int[col][row];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose Array");
        print(transpose);
    }
}

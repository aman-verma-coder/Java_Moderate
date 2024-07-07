public class _19p8_diagonalSum {
    public static void diagonalSum(int mat[][]) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {// Time Complexity O(n^2)
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                } else if (i + j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        System.out.println("By first method: " + sum);
        int sum2 = 0;
        for (int i = 0; i < mat.length; i++) {// Time Complexity O(n)
            sum2 += mat[i][i];
            if (i != mat.length - i - 1) {
                sum2 += mat[i][mat.length - i - 1];
            }
        }
        System.out.println("By secong method: " + sum2);
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        diagonalSum(mat);
    }
}
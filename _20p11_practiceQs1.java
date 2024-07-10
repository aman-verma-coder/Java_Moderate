public class _20p11_practiceQs1 {
    public static int findNoNoOfTimes(int array[][], int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        int key = 7;
        System.out.println("No. of times " + key + " present is " + findNoNoOfTimes(array, key));
        findNoNoOfTimes(array, key);
    }
}
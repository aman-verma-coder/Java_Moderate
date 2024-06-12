public class _17p3_maxSubArraySumKadanesAlgorithm {
    public static void kadaneAlgorithm(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            currSum = currSum + num[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("MaxSum= " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = { -1, -2, 3, -4, 5, 6, 7, -8, 9, 10 };
        kadaneAlgorithm(num);
    }
}
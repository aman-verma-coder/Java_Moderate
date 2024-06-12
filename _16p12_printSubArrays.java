public class _16p12_printSubArrays {
    public static void printSubArray(int num[]) {
        int ts = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(num[j2] + " ");
                    sum = sum + num[j2];
                }
                System.out.println();
                if (max < sum) {
                    max = sum;
                }
                if (min > sum) {
                    min = sum;
                }
                System.out.println("Sum: " + sum);
                ts++;
                // System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: " + ts);
        System.out.println("Max Sum: " + max);
        System.out.println("Min Sum: " + min);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        printSubArray(num);
    }
}
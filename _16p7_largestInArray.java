public class _16p7_largestInArray {
    public static void getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("Largest number is " + largest);
        System.out.println("Smallest number is " + smallest);
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        getLargest(num);
    }
}
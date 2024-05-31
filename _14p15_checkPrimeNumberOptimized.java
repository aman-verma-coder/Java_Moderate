public class _14p15_checkPrimeNumberOptimized {
    public static boolean isPrime(int n) {
        boolean prime = true;
        if (n == 2) {
            prime = true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Optimized
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println(isPrime(n));
    }
}

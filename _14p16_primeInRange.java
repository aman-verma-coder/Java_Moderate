public class _14p16_primeInRange {
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

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 100;
        primeInRange(n);
    }
}

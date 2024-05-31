public class _14p14_checkPrimeNumber {
    public static boolean isPrime(int n) {
        boolean prime = true;
        if (n == 2) {
            prime = true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        int n = 29;
        System.out.println(isPrime(n));
    }
}

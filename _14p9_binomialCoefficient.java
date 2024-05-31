import java.util.Scanner;

public class _14p9_binomialCoefficient {
    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int nfact, rfact, nminusrfact, nmr, binomialcoefficient;
        binomialcoefficient = 0;
        if (r > n) {
            System.out.println("n is greater than r");
        } else {
            nmr = n - r;
            nfact = factorial(n);
            rfact = factorial(r);
            nminusrfact = factorial(nmr);
            binomialcoefficient = nfact / (rfact * nminusrfact);
        }
        return binomialcoefficient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        System.out.println("Enter the value of r");
        r = sc.nextInt();
        System.out.println("Binomial coefficient of " + n + " and " + r + " is " + binCoeff(n, r));
        sc.close();
    }
}

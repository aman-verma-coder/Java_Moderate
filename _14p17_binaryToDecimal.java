import java.util.Scanner;

public class _14p17_binaryToDecimal {
    public static void binnum(int binary) {
        int power, decimal, lastDigit;
        power = 0;
        decimal = 0;
        lastDigit = 0;
        while (binary > 0) {
            lastDigit = binary % 10;
            decimal = decimal + lastDigit * (int) Math.pow(2, power);
            power++;
            binary = binary / 10;
        }
        System.out.println("The decimal of " + binary + " is " + decimal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int binary = sc.nextInt();
        binnum(binary);
        sc.close();
    }
}
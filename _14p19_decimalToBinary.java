import java.util.Scanner;

public class _14p19_decimalToBinary {
    public static void decnum(int decimal) {
        int mynum = decimal;
        int power = 0;
        int binary = 0;
        int lastDigit = 0;
        while (decimal > 0) {
            lastDigit = decimal % 2;
            binary = binary + lastDigit * (int) Math.pow(10, power);
            power++;
            decimal = decimal / 2;
        }
        System.out.println("The binary of " + mynum + " is " + binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        decnum(decimal);
        sc.close();
    }
}
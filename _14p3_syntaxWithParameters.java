import java.util.Scanner;

public class _14p3_syntaxWithParameters {
    public static int sum(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        System.out.println("The sum of " + a + " and " + b + " is " + sum(a, b));
        sc.close();
    }
}
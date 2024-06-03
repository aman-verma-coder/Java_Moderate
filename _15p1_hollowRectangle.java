import java.util.Scanner;

public class _15p1_hollowRectangle {
    public static void hollowSquare(int x, int y) {
        System.out.println("By first method:");
        for (int i = 1; i <= x; i++) {
            if (i == 1 || i == x) {
                for (int j = 1; j <= y; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            } else {
                if (i > 1 && i < x) {
                    for (int j = 1; j <= y; j++) {
                        if (j == 1 || j == y) {
                            System.out.print("*  ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void hollowSquare2(int x, int y) {
        System.out.println("By second method:");
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if (i == 1 || j == 1 || i == x || j == y) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int x = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int y = sc.nextInt();
        hollowSquare(x, y);
        hollowSquare2(x, y);
        sc.close();
    }
}
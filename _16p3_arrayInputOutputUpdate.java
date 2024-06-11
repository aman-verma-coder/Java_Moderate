import java.util.Scanner;

public class _16p3_arrayInputOutputUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        System.out.println("Phy: " + marks[0]);
        System.out.println("Chem: " + marks[1]);
        System.out.println("Maths: " + marks[2]);
        System.out.println("Bio: " + marks[3]);
        System.out.println("CS: " + marks[4]);
        marks[4] = (int) (marks[4] * 1.1);
        System.out.println("CS updated marks: " + marks[4]);
        int avg = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
        System.out.println("Average: " + avg / 5);
        sc.close();
    }
}
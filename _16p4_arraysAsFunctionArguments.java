public class _16p4_arraysAsFunctionArguments {
    public static void update(int marks[], int marks2) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        marks2 = marks2 + 1;
    }

    public static void main(String[] args) {
        int marks[] = { 80, 85, 90, 95, 98 };
        int marks2 = 75;
        update(marks, marks2);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks at [" + i + "]" + marks[i]);
        }
        System.out.println("Marks2: " + marks2);
    }
}
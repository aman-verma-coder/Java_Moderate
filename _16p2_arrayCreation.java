public class _16p2_arrayCreation {
    public static void main(String[] args) {
        int number[] = new int[10];
        int marks[] = { 40, 50, 60, 70, 80 };
        String fruits[] = { "apple", "banana", "mango", "orange" };
        char alphabet[] = { 'A', 'B', 'C', 'D', 'E' };
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i]);
        }
    }
}
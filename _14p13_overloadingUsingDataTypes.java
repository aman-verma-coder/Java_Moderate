public class _14p13_overloadingUsingDataTypes {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 4));
        System.out.println(sum(4.5f, 5.5f));
    }
}
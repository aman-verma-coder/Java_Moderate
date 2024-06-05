public class _15p9_solidRhombus {
    public static void rhombusPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int j2 = 1; j2 <= n; j2++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rhombusPattern(6);
    }
}
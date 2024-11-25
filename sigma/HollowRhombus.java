public class HollowRhombus {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

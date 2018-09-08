import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int[][][] t = new int[n + 1][n + 1][n + 1];
        int result = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int sum = 0;
                for (int k = j; k <= n; k++) {
                    sum += a[i][k];
                    t[i][j][k] = max(t[i - 1][j][k] + sum, sum);
                    result = max(result, t[i][j][k]);
                }
            }
        }
        System.out.println(result);
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}

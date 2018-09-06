import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String POST_FIX = " card(s)";
    private static final double C = 0.5772;

    public static void main(String[] args) {
        while (SCANNER.hasNext()) {
            double c = SCANNER.nextDouble();
            if (c == 0.0) {
                break;
            }
            int result = 0;
            for (int i = 2; i < 2000; i++) {
                double temp = compute(i);
                if (temp > c) {
                    result = i;
                    break;
                }
            }
            System.out.println(result - 1 + POST_FIX);
        }
    }

    private static double compute(int n) {
        double result = 0.0;
        for (int i = 2; i <= n; i++) {
            result = 1.0 / i + result;
        }
        return result;
    }
}
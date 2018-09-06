import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 1;
        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int e = scanner.nextInt();
            int i = scanner.nextInt();
            int d = scanner.nextInt();
            if (p == -1 && e == -1 && i == -1 && d == -1) {
                return;
            }
            p = p % 23;
            e = e % 28;
            i = i % 33;
            int T = 0;
            int z = 21252 + d / 33;
            for (int j = 0; j <= z; j++) {
                T = 33 * j + i;
                if (T == 0) {
                    continue;
                }
                if ((T - p) % 23 == 0 && (T - e) % 28 == 0) {
                    break;
                }
            }
            int r = T - d;
            if (r <= 0) {
                r = 21252 + r;
            }
            System.out.println("Case " + count + ": the next triple peak occurs in " + r + " days.");
            count++;
        }
    }
}
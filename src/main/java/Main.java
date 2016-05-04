import java.util.Scanner;

/**
 * Author : guowang.sun
 * Date : 16/4/10
 * Time : 下午1:12
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int[] a = new int[1002];
        int[] b = new int[1002];
        int[] c = new int[1002];
        a[0] = 1;
        for (int i = 1; i < 1002; ++i) {
            a[i] = (b[i - 1] + c[i - 1]) % 10000;
            b[i] = (a[i - 1] + c[i - 1]) % 10000;
            c[i] = (a[i - 1] + b[i - 1]) % 10000;
        }
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(a[n]);
        }
    }
}



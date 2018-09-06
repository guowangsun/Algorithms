import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (SCANNER.hasNext()) {
            float total = 0.0f;
            for (int i = 0; i < 12; i++) {
                total += SCANNER.nextFloat();
            }
            System.out.printf("$%.2f\n", total/12);
        }
    }
}
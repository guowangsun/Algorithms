import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            double x = scanner.nextFloat();
            double y = scanner.nextFloat();
            double area = Math.PI * (x * x + y * y) / 2;
            int year = (int)Math.ceil(area / 50);
            System.out.println("Property " + (i + 1) + ": This property will begin eroding in year " + year + ".");
        }
        System.out.println("END OF OUTPUT.");
    }
}

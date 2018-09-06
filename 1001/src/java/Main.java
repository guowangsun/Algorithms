import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] datas = line.split(" +");
            BigDecimal r = new BigDecimal(datas[0].trim());
            BigDecimal result = new BigDecimal(datas[0].trim());
            int n = Integer.parseInt(datas[1].trim());
            for (int i = 1; i < n; i++) {
                result = result.multiply(r);
            }
            System.out.println(trimZero(result.toPlainString()));
        }
    }

    private static String trimZero(String s) {
        char[] sArr = s.toCharArray();
        int start = 0;
        for (int i = 0; i < sArr.length; i++) {
            start = i;
            if (sArr[i] != '0') {
                break;
            }
        }
        int end = sArr.length - 1;
        if (s.contains(".")) {
            for (int i = sArr.length - 1; i >= 0; i--) {
                end = i;
                if (sArr[i] != '0') {
                    break;
                }
            }
        }
        if (sArr[end] == '.') {
            end--;
        }
        char[] resultArr = new char[end - start + 1];
        System.arraycopy(sArr, start, resultArr, 0, end - start + 1);
        return new String(resultArr);
    }
}
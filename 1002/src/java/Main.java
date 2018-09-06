import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    static char[] book = {'2', '2', '2', '3', '3', '3', '4', '4', '4', '5', '5', '5', '6', '6', '6', '7', '7', '7', '7', '8', '8', '8', '9', '9', '9', '9'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<String, Integer>();
        int lines = scanner.nextInt();
        for (; lines > 0; lines--) {
            String num = scanner.next();
            String result = process(num.toCharArray());
            if (map.get(result) == null) {
                map.put(result, 1);
            } else {
                map.put(result, map.get(result) + 1);
            }
        }
        boolean mul = false;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                mul = true;
            }
        }
        if (!mul) {
            System.out.println("No duplicates.");
        }
    }

    private static String process(char[] numArr) {
        char[] resultArr = new char[100];
        for (int i = 0, j = 0; i < numArr.length; i++) {
            if (numArr[i] == '-') {
                continue;
            }
            if (j == 3) {
                resultArr[j++] = '-';
            }
            if (numArr[i] >= 'A') {
                resultArr[j++] = book[numArr[i] - 'A'];
            } else {
                resultArr[j++] = numArr[i];
            }
        }
        StringBuilder stringBuilder = new StringBuilder(resultArr.length);
        for (int i = 0; i < resultArr.length; i++) {
            if (resultArr[i] >= '0' || resultArr[i] == '-') {
                stringBuilder.append(resultArr[i]);
            }
        }
        return stringBuilder.toString();
    }
}
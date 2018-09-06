import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>();
            for (int i = 0; i < m; i++) {
                String line = scanner.next();
                list.add(new AbstractMap.SimpleEntry<Integer, String>(getMeasure(line), line));
            }
            Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
                @Override
                public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                    return o1.getKey() - o2.getKey();
                }
            });
            for (Map.Entry<Integer, String> entry : list) {
                System.out.println(entry.getValue());
            }
        }
    }

    private static int getMeasure(String line) {
        char[] chars = line.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
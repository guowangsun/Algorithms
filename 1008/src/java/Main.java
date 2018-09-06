import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Integer> Haab = new HashMap<String, Integer>();
    private static final String[] tzolkin = {"imix", "ik", "akbal", "kan", "chicchan", "cimi", "manik", "lamat", "muluk",
        "ok", "chuen", "eb", "ben", "ix", "mem", "cib", "caban", "eznab", "canac", "ahau"};

    static {
        Haab.put("pop", 0);
        Haab.put("no", 1);
        Haab.put("zip", 2);
        Haab.put("zotz", 3);
        Haab.put("tzec", 4);
        Haab.put("xul", 5);
        Haab.put("yoxkin", 6);
        Haab.put("mol", 7);
        Haab.put("chen", 8);
        Haab.put("yax", 9);
        Haab.put("zac", 10);
        Haab.put("ceh", 11);
        Haab.put("mac", 12);
        Haab.put("kankin", 13);
        Haab.put("muan", 14);
        Haab.put("pax", 15);
        Haab.put("koyab", 16);
        Haab.put("cumhu", 17);
        Haab.put("uayet", 18);
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            int haabDay = Integer.parseInt(scanner.next().replaceFirst("\\.", ""));
            int haabMonth = Haab.get(scanner.next());
            int haddbYear = scanner.nextInt();
            int haabMonths = haabMonth == 18 ? 5 : 20;
            int days = haddbYear * 365 + haabMonth * 20 + haabDay;
            int tzolkinYear = days / 260;
            String tzolkinMonth = tzolkin[days % 20];
            int tzolkinDay = days % 13 + 1;
            System.out.println(tzolkinDay + " " + tzolkinMonth + " " + tzolkinYear);
        }
    }
}
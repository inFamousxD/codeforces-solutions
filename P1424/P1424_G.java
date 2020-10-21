import java.util.Scanner;
import java.util.TreeMap;

public class P1424_G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();

            map.put(a, map.getOrDefault(a, 0)+1);
            map.put(b, map.getOrDefault(b, 0)-1);
        }

        int previous = 0, current = 0, ans = 0, year = 0;
        for (int i : map.keySet()) {
            current = map.get(i);
            current = current + previous;
            if (current > ans) {
                year = i;
                ans = current;
            }
            previous = current;
        }
        System.out.println(year + " "  + ans);
    }
}
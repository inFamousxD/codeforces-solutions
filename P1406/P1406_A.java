import java.util.Scanner;
import java.util.HashMap;

public class P1406_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; ++i) {
                int x = in.nextInt();
                map.put(x, map.getOrDefault(x, 0) +1);
            }

            int A = 0, B = 0;

            for (int i = 0; i <= 100; ++i) {
                if (map.getOrDefault(i, 0) == 0) {
                    A = i;
                    break;
                } else map.put(i, map.getOrDefault(i, 0)-1);
            }
            for (int i = 0; i <= 100; ++i) {
                if (map.getOrDefault(i, 0) == 0) {
                    B = i;
                    break;
                } else map.put(i, map.getOrDefault(i, 0)-1);
            }

            System.out.println(A+B);
        }
    }
}
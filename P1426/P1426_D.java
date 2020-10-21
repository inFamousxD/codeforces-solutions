import java.util.HashMap;
import java.util.Scanner;

public class P1426_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        long last = -1;

        map.put(0l, -1);

        int n = in.nextInt();
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            sum += in.nextLong();
            if (map.containsKey(sum) && last <= map.get(sum) + 1) {
                ans++;
                last = i;
            }
            map.put(sum, i);
        }
        System.out.println(ans);

        in.close();
    }
}

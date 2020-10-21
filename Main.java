import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        // int t = 1;
        
        while (t-- > 0) {
            long n = in.nextLong();
            long k = in.nextLong();

            List<Long> arr = new ArrayList<Long>();

            for (int i = 0; i < n; ++i) arr.add(in.nextLong());

            Collections.sort(arr, Collections.reverseOrder()); 
            long sum = 0l;

            for (int i = 0; i <= k; ++i) {
                sum += arr.get(i);
            }

            System.out.println(sum);
        }
    }
}

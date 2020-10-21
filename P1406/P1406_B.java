import java.util.*;

public class P1406_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; ++i)
                arr[i] = in.nextInt();

            Arrays.sort(arr);
            System.out.println(Math.max(arr[n-1]*arr[0]*arr[1]*arr[2]*arr[3],Math.max(arr[n-1]*arr[n-2]*arr[n-3]*arr[0]*arr[1],arr[n-1]*arr[n-2]*arr[n-3]*arr[n-4]*arr[n-5])));
        }
    }
}
import java.util.*;

public class P1427_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        //int t = 1;
        
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];

            int sum = 0;
            for (int i = 0; i < n; ++i)
                sum += arr[i] = in.nextInt();

            if (sum == 0) {
                System.out.println("NO");
                continue;
            } else System.out.println("YES");

            Arrays.sort(arr);
            if (sum < 0) {
                for (int i = 0; i < n; ++i) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = n-1; i >= 0; --i) {
                    System.out.print(arr[i] + " ");
                }
            } System.out.println();
        }
    }
}
import java.util.*;

public class P1419_D1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Main o = new Main();
        
        int n = in.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; ++i) arr[i] = in.nextInt();
        Arrays.sort(arr);

        long[] ordered = new long[n];
        int pointer = 0;
        for (int i = n/2; i < n && pointer < n; i++) {
            ordered[pointer] = arr[i];
            pointer += 2;
        }
        pointer = 1;
        for (int i = 0; i < (n-(n/2-1)) && pointer < n; i++) {
            ordered[pointer] = arr[i];
            pointer += 2;
        }
        System.out.println(n%2 == 0 ? n/2-1 : n/2);
        for (long i : ordered) System.out.print(i + " ");

        in.close();
    }
}
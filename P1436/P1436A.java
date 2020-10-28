import java.util.Scanner;

public class P1436A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        //int t = 1;
        
        while (t-- > 0) {
            int n = in.nextInt();
            int x = in.nextInt();
            long sum = 0;
            for (int i = 0; i < n; ++i)
                sum += (long)in.nextInt();

            if (sum == (long)x) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
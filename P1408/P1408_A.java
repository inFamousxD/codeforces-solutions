import java.util.Scanner;

public class P1408_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a  = new int[n];
            int[] b  = new int[n];
            int[] c  = new int[n];

            for (int i = 0; i < n; ++i)
                a[i] = in.nextInt();
            for (int i = 0; i < n; ++i)
                b[i] = in.nextInt();
            for (int i = 0; i < n; ++i)
                c[i] = in.nextInt();

            int[] p = new int[n];

            p[0] = a[0];
            for (int i = 1; i < n-1; ++i) {
                if (p[i-1] != a[i])
                    p[i] = a[i];
                else if (p[i-1] != b[i])
                    p[i] = b[i];
                else
                    p[i] = c[i];
            }

            if (p[0] != a[n-1] && p[n-2] != a[n-1])
                p[n-1] = a[n-1];
            else if (p[0] != b[n-1] && p[n-2] != b[n-1])
                p[n-1] = b[n-1];
            else
                p[n-1] = c[n-1];

            for (int i = 0; i < n; ++i)
                System.out.print(p[i] + " ");

            System.out.println();
        }
    }
}
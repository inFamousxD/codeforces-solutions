import java.util.Scanner;

public class P1426_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            boolean assessed = false;
            for (int x = 0; x < n; ++x) {
                int a, b, c, d;
                a = in.nextInt();
                b = in.nextInt();
                c = in.nextInt();
                d = in.nextInt();
                a = a + d;
                if (m%2 == 1 && !assessed) {
                    System.out.println("NO");
                    assessed = true;
                    continue;
                }

                if (m == 2) {
                    if (b == c && !assessed) {System.out.println("YES"); assessed = true; continue;}
                    if (!assessed && x == n-1) System.out.println("NO");
                } else {
                    if (b == c && !assessed) {
                        assessed = true;
                        System.out.println("YES");
                        continue;
                    }
                    if (!assessed && x == n-1) {
                        System.out.println("NO");
                    }
                }
            }
        }

        in.close();
    }
}

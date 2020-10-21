import java.util.Scanner;

public class P1426_F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        String s = in.next();

        long a, b, c, inc = 1;
        a = b = c = 0l;

        long mod = ((long)1e9) + 7;

        for (int i = 0; i < len; ++i) {
            if (s.charAt(i) == 'a') a = (a+inc)%mod;
            else if (s.charAt(i) == 'b') b = (b+a)%mod;
            else if (s.charAt(i) == 'c') c = (c+b)%mod;
            else {
                c = (3*c + b) % mod;
                b = (3*b + a) % mod;
                a = (3*a + inc) % mod;
                inc = (3*inc) % mod;
            }
        }

        System.out.println(c%mod);

        in.close();
    }
}

import java.util.Scanner;

public class P1426_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt()-2;
            int x = in.nextInt();

            if ((n+2) <= 2) System.out.println(1);
            else System.out.println(1 + (int)Math.ceil((float)n/(float)x));
        }

        in.close();
    }
}

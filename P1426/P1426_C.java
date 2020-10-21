import java.util.Scanner;

public class P1426_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            System.out.println((int)Math.ceil(2*Math.sqrt(n) - 2));
        }

        in.close();
    }
}

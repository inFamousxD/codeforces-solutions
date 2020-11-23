import java.util.Scanner;

public class P1452A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        //int t = 1;
        
        while (t-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();

            if (x == y) System.out.println(2*x);
            else System.out.println(Math.max(x, y)*2-1);
        }
    }
}
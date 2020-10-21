import java.util.Scanner;

public class P1409_B {
    public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t -- > 0){
			long a = in.nextInt(), b = in.nextInt(), x = in.nextInt(), y = in.nextInt(), n = in.nextInt();
			long ans = (long)1e18;
			ans = Math.min(Math.max(a - n, x) * Math.max(b - (n - Math.min(n, a - x)), y), ans);
			ans = Math.min(Math.max(b - n, y) * Math.max(a - (n - Math.min(n, b - y)), x), ans);
			System.out.println(ans);
		}
	}
}
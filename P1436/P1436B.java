import java.util.*;

public class P1436B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt();

			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					if (i == j || (i+1) == j || (i == (n-1) && j == 0))
						System.out.print("1 ");
					else
						System.out.print("0 ");
				}
				System.out.println();
			}
		}
	}
}

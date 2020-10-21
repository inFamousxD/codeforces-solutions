import java.util.Arrays;
import java.util.Scanner;

public class P1422_B {
    public static void main(String[] args) {
        // Main o = new Main();
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            long[][] matrix = new long[n][m];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    matrix[i][j] = in.nextInt();
            long ans = 0;
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++) {
                    long[] b = new long[3];
                    b[0] = matrix[i][j];
                    b[1] = matrix[n-i-1][j];
                    b[2] = matrix[i][m-j-1];

                    Arrays.sort(b);
                    ans += Math.abs(b[1]-b[0])+Math.abs(b[1]-b[2]);
                    matrix[i][j] = b[1];
                    matrix[n-i-1][j] = b[1];
                    matrix[i][m-j-1] = b[1];
                }
            System.out.println(ans);
{
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j)
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("\n");
            }

        }

        in.close();
    }
}

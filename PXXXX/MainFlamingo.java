import java.util.*;
 
public class MainFlamingo {
    public void function() {
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        int[] arr = new int[n+1];
        System.out.println("? 2 3");
        System.out.flush();

        int buffer = in.nextInt();

        for (int i = 2; i <= n; ++i) {
            System.out.println("? 1 " + i);
            arr[i] = in.nextInt();
            if (i == 3) {
                arr[1] = arr[i] - buffer;
            }
            System.out.flush();
        }

        for (int i = n; i > 0; --i) {
            arr[i] = arr[i] - arr[i-1];
        }

        System.out.print("! ");
        for (int i = 1; i <= n; i++)
            System.out.print(arr[i] + " ");

        System.out.flush();

        in.close();
    }
}

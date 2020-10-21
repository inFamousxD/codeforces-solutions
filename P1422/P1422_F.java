import java.util.Scanner;

public class P1422_F {
    public int function(int[] element_array) { 
        int lcm_of_array_elements = 1; 
        int divisor = 2; 
        int mod = (int)1e9+7;
          
        while (true) { 
            int counter = 0; 
            boolean divisible = false; 
              
            for (int i = 0; i < element_array.length; i++) { 
                if (element_array[i] == 0)
                    return 0; 

                else if (element_array[i] < 0)
                    element_array[i] = (element_array[i] * (-1))%mod;

                if (element_array[i] == 1)
                    counter++; 

                if (element_array[i] % divisor == 0) { 
                    divisible = true; 
                    element_array[i] = (element_array[i] / divisor)%mod; 
                } 
            } 
  
            if (divisible) { 
                lcm_of_array_elements = ((lcm_of_array_elements%mod) * (divisor%mod))%mod; 
            } 
            else { 
                divisor++; 
            } 

            if (counter == element_array.length) { 
                return lcm_of_array_elements%mod; 
            } 
        } 
    } 
    public int[] pairs(int q0, int q1, int last, int n) {
        int[] lr = new int[2];

        lr[0] = (last + q0)%n +1;
        lr[1] = (last + q1)%n +1;

        if (lr[0] > lr[1]) {
            int temp = lr[0];
            lr[0] = lr[1];
            lr[1] = temp;
        }

        return lr;
    }
    public static void main(String[] args) {
        P1422_F ob = new P1422_F();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) arr[i] = in.nextInt();
        int m = in.nextInt();
        int[][] queries = new int[m][2];

        int last = 0;

        for (int i = 0; i < m; ++i) {
            queries[i][0] = in.nextInt();
            queries[i][1] = in.nextInt();
            int[] pair = ob.pairs(queries[i][0], queries[i][1], last, n);
            // System.out.println(pair[0] + " " + pair[1]);
            if (arr.length < 2) {
                System.out.println(arr[0]);
                continue;
            }
            if (pair[0] == pair[1]) {
                last = arr[(int)pair[0]-1];
                System.out.println(last);
                continue;
            }
            int[] subarray = new int[(int)(pair[1] - (pair[0] - 1))];
            int pointer = 0;
            for (int j = pair[0]-1; j < pair[1]; ++j)
                subarray[pointer++] = arr[(int)j];   
            last = ob.function(subarray)%(int)(1e9+7);
            System.out.println(last);
        }

        in.close();
        
    }
}

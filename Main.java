import java.util.*;
import java.lang.*;

public class Main {
    static boolean checkPrime(int n){  
        int i, m = 0, flag = 0;
        boolean isPrime = false;   
        m = n/2;      
        if (n == 0 || n == 1){  
            isPrime = false;      
        } else {  
            for (i = 2; i <= m; i++) {      
                if (n%i == 0){      
                    isPrime = false;     
                    flag = 1;      
                    break;      
                }      
            }      
            if(flag == 0) { isPrime = true; }
        }  
        return isPrime;
    }  
    public static int nextPrime(int num) {
        num++;
        for (int i = 2; i < num; i++) {
            if(num%i == 0) {
                num++;
                i=2;
            } else {
                continue;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        // int t = 1;
        
        while (t-- > 0) {
            int n = in.nextInt();
            if (checkPrime(n)) {
                for (int i = 0; i < n; ++i) {
                    for (int j = 0; j < n; ++j) {
                        System.out.print("1 ");
                    }
                    System.out.println();
                }
            } else {
                int x = 0;
                int y = n;
                int make = nextPrime(y)-y+1;
                while (checkPrime(make)) {
                    y = nextPrime(y);
                    make = nextPrime(y)-y+1;
                }        
                if (checkPrime(2*n-1)) {
                    make = n;
                }
                for (int i = 0; i < n; ++i) {
                    for (int j = 0; j < n; ++j) {
                        if (i == x && j == x) {
                            System.out.print(make + " ");
                            x++;
                            continue;
                        }
                        System.out.print("1 ");
                    }
                    System.out.println();
                }
            }
        }

        in.close();
    }
}

// -- Templates --
// System.out.println();
// System.out.print();
// for (int i = 0; i < n; ++i)
// Map<> map = new HashMap<>();

// 3x3
// 3 3 1
// 3 1 3
// 1 3 3

// 4x4
// 4 4 4 1
// 4 1 4 4
// 4 4 1 4
// 1 4 4 4

// 5x5
// 5 5 5 5 9
// 5 3 5 5 5
// 5 5 3 5 5
// 5 5 5 3 5
// 3 5 5 5 5

// 5x5 (2)
// 1 1 1 1 1
// 1 1 1 1 1
// 1 1 1 1 1
// 1 1 1 1 1
// 1 1 1 1 1

// 9x9 
// 1 1 1 1 1 1 1 1 9
// 
// 
// 
// 
// 
// 
// 
// 

// 4x4
// 1 1 1 4
// 1 1 4 1
// 1 4 1 1
// 4 1 1 1

// 6x6
// 1 1 1 1 1 6
// 
// 
// 
// 
// 
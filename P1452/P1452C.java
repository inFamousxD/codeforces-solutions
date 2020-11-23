import java.util.Scanner;
import java.util.*;

public class P1452C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        //int t = 1;
        
        while (t-- > 0) {
            String s = in.next();
            int ccount = 0;
            int scount = 0;
            int tcount = 0;

            for (char i : s.toCharArray()) {
                if (i == '(') {
                    ccount++;
                } else if (i == '[') {
                    scount++;
                } else if (i == ')') {
                    if (ccount > 0) {
                        ccount--;
                        tcount++;
                    }
                } else {
                    if (scount > 0) {
                        scount--;
                        tcount++;
                    }
                }
            }

            System.out.println(tcount);
        }
    }
}
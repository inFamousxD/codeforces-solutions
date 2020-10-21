import java.util.*;

public class P1323 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        String s = in.next();
        boolean changed = false;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (!changed && c == '6') {
                c = '9';
                changed = true;
            }
            str.append(c);
        }
        System.out.println(str.toString());
    }
}
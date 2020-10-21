import java.util.*;
 
public class P1426_E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        long t = in.nextInt();
 
        long a_rock = in.nextLong(),
             a_scis = in.nextLong(),
             a_papr = in.nextLong();
        long b_rock = in.nextLong(),
             b_scis = in.nextLong(),
             b_papr = in.nextLong();
 
        long max_rock = a_rock > 0 ? (a_rock < b_scis ? (a_rock) : (a_rock - (a_rock-b_scis))) : (0);
        long max_scis = a_scis > 0 ? (a_scis < b_papr ? (a_scis) : (a_scis - (a_scis-b_papr))) : (0);
        long max_papr = a_papr > 0 ? (a_papr < b_rock ? (a_papr) : (a_papr - (a_papr-b_rock))) : (0);
 
        long min = 0;
 
        min = Math.min(b_rock, a_rock + a_scis) + Math.min(b_scis, a_scis + a_papr) + Math.min(b_papr, a_papr + a_rock);
        min = t - min;
        System.out.println(min + " " + (max_papr + max_rock + max_scis));
 
        in.close();
    }
}
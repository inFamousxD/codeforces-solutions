import java.util.Scanner;

public class P1425_H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int D = in.nextInt();

            if ((A+B)%2 == 0) {
                if ((B+C) > 0 && (A+D) > 0) {
                    System.out.println("Tidak Tidak Ya Ya");
                } else if ((B+C) == 0 && (A+D) > 0){
                    System.out.println("Tidak Tidak Tidak Ya");
                } else {
                    System.out.println("Tidak Tidak Ya Tidak");
                }
            } else {
                if ((B+C) > 0 && (A+D) > 0) {
                    System.out.println("Ya Ya Tidak Tidak");
                } else if ((B+C) == 0 && (A+D) > 0){
                    System.out.println("Ya Tidak Tidak Tidak");
                } else {
                    System.out.println("Tidak Ya Tidak Tidak");
                }
            }
        }       
    }
}
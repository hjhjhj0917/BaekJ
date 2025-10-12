import java.util.Scanner;

public class BaekJun14470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        if (a < 0) {
            System.out.println((c*(-a)) + d + (b*e));
        } else if (a == 0) {
            System.out.println(d + (c*b));
        } else {
            System.out.println((b-a) * e);
        }
    }
}

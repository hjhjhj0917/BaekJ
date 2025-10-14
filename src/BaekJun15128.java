import java.util.Scanner;

public class BaekJun15128 {

    public static boolean isIntegerArea(int p1, int q1, int p2, int q2) {
        long numerator = (long) p1 * p2;
        long denominator = 2L * q1 * q2;

        return numerator % denominator == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        if (isIntegerArea(n1, n2, n3, n4)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

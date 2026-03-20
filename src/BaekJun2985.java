import java.util.Scanner;

public class BaekJun2985 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 + n2 == n3) {
            System.out.println(n1 + "+" + n2 + "=" + n3);
            return;
        }
        if (n1 - n2 == n3) {
            System.out.println(n1 + "-" + n2 + "=" + n3);
            return;
        }
        if (n1 * n2 == n3) {
            System.out.println(n1 + "*" + n2 + "=" + n3);
            return;
        }
        if (n1 / n2 == n3) {
            System.out.println(n1 + "/" + n2 + "=" + n3);
            return;
        }
        if (n1 == n2 + n3) {
            System.out.println(n1 + "=" + n2 + "+" + n3);
            return;
        }
        if (n1 == n2 - n3) {
            System.out.println(n1 + "=" + n2 + "-" + n3);
            return;
        }
        if (n1 == n2 * n3) {
            System.out.println(n1 + "=" + n2 + "*" + n3);
            return;
        }
        if (n1 == n2 / n3) {
            System.out.println(n1 + "=" + n2 + "/" + n3);
            return;
        }
    }
}

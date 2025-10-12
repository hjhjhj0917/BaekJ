import java.util.Scanner;

public class BaekJun15025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tine1 = sc.nextInt();
        int tine2 = sc.nextInt();

        if (tine1 == tine2 && tine1 + tine2 != 0) {
            System.out.println("Even " + (tine1 + tine2));
        } else if (tine1 != tine2 && tine1 + tine2 != 0) {
            System.out.println("Odd " + (Math.max(tine1, tine2) * 2));
        } else if (tine1 + tine2 == 0) {
            System.out.println("Not a moose");
        }
    }
}

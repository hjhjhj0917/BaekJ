import java.util.Scanner;

public class BaekJun20233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int monPay1 = sc.nextInt();
        int minPay1 = sc.nextInt();
        int monPay2 = sc.nextInt();
        int minPay2 = sc.nextInt();
        int totalBicycle = sc.nextInt();

        int daily1 = 0;
        int daily2 = 0;

        if (totalBicycle - 30 > 0) daily1 = totalBicycle - 30;
        if (totalBicycle - 45 > 0) daily2 = totalBicycle - 45;

        int one = monPay1 + daily1 * 21 * minPay1;
        int two = monPay2 + daily2 * 21 * minPay2;

        System.out.println(one + " " + two);
    }
}

import java.util.Scanner;

public class BaekJun21633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        if (money < 200 || money > Math.pow(10, 9)) return;

        double charge = 25 + (money * 0.01);

        if (charge < 100) charge = 100;
        if (charge > 2000) charge = 2000;

        System.out.printf("%.2f", charge);
    }
}

import java.util.Scanner;

public class BaekJun15474 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int pencilNum1 = sc.nextInt();
        int price1 = sc.nextInt();
        int pencilNum2 = sc.nextInt();
        int price2 = sc.nextInt();

         int remain1 = 0;
        if (num % pencilNum1 > 0) remain1 = 1;

        int remain2 = 0;
        if (num % pencilNum2 > 0) remain2 = 1;

        int res1 = (num / pencilNum1 + remain1) * price1;
        int res2 = (num / pencilNum2 + remain2) * price2;

        System.out.println(Math.min(res1, res2));
    }
}

import java.util.Scanner;

public class BaekJun25704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int couponNum = sc.nextInt();
        int price = sc.nextInt();
        int minPrice = price;

        if (couponNum >= 5) {
            minPrice = Math.min(minPrice, (price - 500));
        }
        if (couponNum >= 10) {
            minPrice = Math.min(minPrice, (price - (int)(price * 0.1)));
        }
        if (couponNum >= 15) {
            minPrice = Math.min(minPrice, (price - 2000));
        }
        if (couponNum >= 20) {
            minPrice = Math.min(minPrice, (price - (int)(price * 0.25)));
        }
        if (minPrice < 0) {
            System.out.println(0);
        } else {
            System.out.println(minPrice);
        }
    }
}

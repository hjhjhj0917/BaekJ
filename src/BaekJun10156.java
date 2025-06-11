import java.util.Scanner;

public class BaekJun10156 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int num = sc.nextInt();
        int money = sc.nextInt();

        if (price * num > money) {
            System.out.println(price * num - money);
        } else {
            System.out.println(0);
        }
    }
}

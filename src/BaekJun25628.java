import java.util.Scanner;

public class BaekJun25628 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bun = sc.nextInt();
        int patty = sc.nextInt();

        int burgerNum = 0;
        if (bun >= patty*2) {
            burgerNum = patty;
        } else {
            burgerNum = bun/2;
        }
        System.out.println(burgerNum);
    }
}

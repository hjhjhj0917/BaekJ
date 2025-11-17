import java.util.Scanner;

public class BaekJun1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        int num = sc.nextInt();
        int a = num / 10;
        int b = num % 10;
        int c = a + b;
        int cmp = (b * 10) + (c % 10);

        while (true) {

            count++;

            if (cmp == num) break;

            int a1 = cmp / 10;
            int b1 = cmp % 10;
            int c1 = a1 + b1;
            cmp = (b1 * 10) + (c1 % 10);

        }

        System.out.println(count);
    }
}

import java.util.Scanner;

public class BaekJun8558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 1;

        if (num >= 5) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < num; i++) {
            result *= i+1;
        }

        System.out.println(result % 10);
    }
}

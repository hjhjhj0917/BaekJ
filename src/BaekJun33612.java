import java.util.Scanner;

public class BaekJun33612 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int year = 2024;
        int month = 8;
        int hold = (num - 1) * 7 + month;

        if (num < 1 || num > 5) {
            return;
        }
        if (hold <= 12) {
            System.out.println(year + " " + hold);
        } else {
            if (hold % 12 == 0) {
                System.out.println(year + (hold / 12 - 1) + " " + 12);
            } else {
                System.out.println(year + (hold / 12) + " " + hold % 12);
            }
        }
    }
}

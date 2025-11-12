import java.util.Scanner;

public class BaekJun1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int youngSik = 0;
        int minSik = 0;

        for (int i = 0; i < month; i++) {

            int callTime = sc.nextInt();

            youngSik += ((callTime / 30) + 1) * 10;
            minSik += ((callTime / 60) + 1) * 15;
        }

        if (youngSik > minSik) {
            System.out.println("M " + minSik);
        } else if (youngSik < minSik) {
            System.out.println("Y " + youngSik);
        } else {
            System.out.println("Y M " + youngSik);
        }
    }
}

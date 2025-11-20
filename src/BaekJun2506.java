import java.util.Scanner;

public class BaekJun2506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int res = 0;

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            int score = sc.nextInt();

            if (score == 1) {
                count++;
                res += count;
            } else {
                count = 0;
            }
        }

        System.out.println(res);
    }
}

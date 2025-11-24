import java.util.Scanner;

public class BaekJun2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int res = 0;

        for (int i = 0; i < 7; i++) {

            int num = sc.nextInt();

            if (num % 2 != 0) {
                res += num;
                min = Math.min(min, num);
            }
        }
        if (res == 0) {
            System.out.println(-1);
        }else {
            System.out.println(res + "\n" + min);
        }
    }
}

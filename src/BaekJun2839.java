import java.util.Scanner;

public class BaekJun2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();
        int cnt1 = Integer.MAX_VALUE;
        int cnt2 = Integer.MAX_VALUE;
        int cnt3 = Integer.MAX_VALUE;
        int min = 0;
        int res = 0;

        if (weight % 3 == 0 || weight % 5 == 0) {
            if ((weight % 3) % 5 == 0) {
                cnt1 = (weight / 3) + ((weight % 3) / 5);
            }
            if ((weight % 5) % 3 == 0) {
                cnt2 = (weight / 5) + ((weight % 5) / 3);
            }
            if (weight % 5 == 0) {
                cnt3 = weight / 5;
            } else if (weight % 3 == 0) {
                cnt3 = weight / 3;
            }
            min = Math.min(cnt1, cnt2);
            res = Math.min(cnt3, min);
            System.out.println(res);
        } else {
            System.out.println(-1);
        }
    }
}

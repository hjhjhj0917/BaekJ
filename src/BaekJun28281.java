import java.util.Arrays;
import java.util.Scanner;

public class BaekJun28281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int birthDDay = sc.nextInt();
        int socksNum = sc.nextInt();
        int[] prices = new int[birthDDay];
        int[] result = new int[birthDDay-1];

        for (int i = 0; i < birthDDay; i++) {
            int socksPrice = sc.nextInt();

            prices[i] = socksPrice * socksNum;
        }
        for (int i = 0; i < birthDDay - 1; i++) {
            result[i] = prices[i] + prices[i+1];
        }
        Arrays.sort(result);
        System.out.println(result[0]);
    }
}

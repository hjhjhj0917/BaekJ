import java.util.Scanner;

public class BaekJun17912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int result = 0;
        int[] amount = new int[day];

        for (int i = 0; i < day; i++) {

            amount[i] = sc.nextInt();

            min = Math.min(min, amount[i]);
        }

        for (int i = 0; i < amount.length; i++) {

            if (min == amount[i]) {
                result = i;

                break;
            }
        }

        System.out.println(result);
    }
}

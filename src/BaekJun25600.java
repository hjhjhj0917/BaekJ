import java.util.Scanner;

public class BaekJun25600 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int participant = sc.nextInt();
        int[] results = new int[participant];

        for (int i = 0; i < participant; i++) {
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            int result = score1 * (score2 + score3);
            if (score1 == score2 + score3) {
                results[i] = result * 2;
            } else {
                results[i] = result;
            }
        }
        int maxScore = results[0];
        for (int i = 1; i < results.length; i++) {
            if (maxScore < results[i]) {
                maxScore = results[i];
            }
        }
        System.out.println(maxScore);
    }
}

import java.util.Scanner;

public class BaekJun2476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 사람 수
        int maxPrize = 0;      // 가장 큰 상금 저장용

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int prize = 0;

            if (a == b && b == c) {
                // 3개 다 같음
                prize = 10000 + a * 1000;
            } else if (a == b || a == c) {
                // a와 b 같거나 a와 c 같음
                prize = 1000 + a * 100;
            } else if (b == c) {
                // b와 c 같음
                prize = 1000 + b * 100;
            } else {
                // 모두 다름 → 가장 큰 눈 × 100
                int max = Math.max(a, Math.max(b, c));
                prize = max * 100;
            }

            if (prize > maxPrize) {
                maxPrize = prize;
            }
        }

        System.out.println(maxPrize);
        sc.close();
    }
}

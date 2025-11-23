import java.util.Scanner;

public class BaekJun2547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            long modSum = 0;

            for (int i = 0; i < N; i++) {
                long candy = sc.nextLong();
                modSum = (modSum + (candy % N)) % N;
            }

            if (modSum == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

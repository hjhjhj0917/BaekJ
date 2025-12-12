import java.util.Scanner;

public class BaekJun22155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            int ifCnt = sc.nextInt();
            int forCnt = sc.nextInt();

            if ((ifCnt <= 1 && forCnt <= 2) || (ifCnt <= 2 && forCnt <= 1)) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        }

        System.out.println(sb);
    }
}

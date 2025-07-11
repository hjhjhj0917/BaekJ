import java.util.Scanner;

public class BaekJun7595 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNext()) {

            int num = sc.nextInt();

            if (num == 0) break;

            for (int i = 0; i < num; i++) {
                for (int j = 0; j <= i; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}

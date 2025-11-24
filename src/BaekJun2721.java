import java.util.Scanner;

public class BaekJun2721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            int res = 0;
            int caseNum = sc.nextInt();

            for (int j = 1; j <= caseNum; j++) {

                int functionT = 0;

                for (int k = 1; k <= j + 1; k++) {

                    functionT += k;
                }
                res += j * functionT;
            }

            sb.append(res + "\n");
        }

        System.out.println(sb);
    }
}

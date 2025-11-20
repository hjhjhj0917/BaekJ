import java.util.Scanner;

public class BaekJun2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {

            int countZero = 0;

            for (int j = 0; j < 4; j++) {

                int n = sc.nextInt();

                if (n == 0) countZero++;
            }

            if (countZero == 1) sb.append("A");
            else if (countZero == 2) sb.append("B");
            else if (countZero == 3) sb.append("C");
            else if (countZero == 4) sb.append("D");
            else if (countZero == 0) sb.append("E");

            if (i != 2) sb.append("\n");
        }

        System.out.println(sb);
    }
}

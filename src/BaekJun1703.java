import java.util.Scanner;

public class BaekJun1703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNextInt()) {

            int year = sc.nextInt();
            int res = 1;

            if (year == 0) break;

            for (int i = 0; i < year; i++) {

                int grow = sc.nextInt();
                int prune = sc.nextInt();

                res = (res * grow) - prune;
            }

            sb.append(res + "\n");
        }

        System.out.println(sb);
    }
}

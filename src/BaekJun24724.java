import java.util.Scanner;

public class BaekJun24724 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            int manageNum = sc.nextInt();

            sb.append("Material Management " + i + "\n");

            int stndSize = sc.nextInt();
            int stndWeight = sc.nextInt();

            for (int j = 0; j < manageNum; j++) {

                int cmpSize = sc.nextInt();
                int cmpWeight = sc.nextInt();
            }

            sb.append("Classification ---- End!\n");
        }

        System.out.println(sb);
    }
}

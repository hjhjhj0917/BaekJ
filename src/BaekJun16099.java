import java.util.Scanner;

public class BaekJun16099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {

            long lt = sc.nextLong();
            long wt = sc.nextLong();
            long le = sc.nextLong();
            long we = sc.nextLong();

            long telecomSize = lt * wt;
            long eureSize = le * we;

            if (telecomSize > eureSize) {
                sb.append("TelecomParisTech\n");
            } else if (eureSize == telecomSize) {
                sb.append("Tie\n");
            } else {
                sb.append("Eurecom\n");
            }
        }

        System.out.println(sb);
    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class BaekJun1247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {

            int testSetNum = sc.nextInt();
            BigInteger res = new BigInteger("0");

            for (int j = 0; j < testSetNum; j++) {

                BigInteger num = sc.nextBigInteger();
                res = res.add(num);
            }

            if (res.signum() == 1) {
                sb.append("+\n");
            } else if (res.signum() == -1) {
                sb.append("-\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.println(sb);
    }
}

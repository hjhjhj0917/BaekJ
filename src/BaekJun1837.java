import java.math.BigInteger;
import java.util.Scanner;

public class BaekJun1837 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger pw = sc.nextBigInteger();
        int key = sc.nextInt();
        int res = 1;

        for (int i = 2; i < key; i++) {
            if (pw.mod(BigInteger.valueOf(i)).compareTo(BigInteger.valueOf(0)) == 0) {
                System.out.println("BAD " + i);
                res = 0;
                break;
            }
        }

        if (res == 1) {
            System.out.println("GOOD");
        }
    }
}

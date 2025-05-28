import java.math.BigInteger;
import java.util.Scanner;

public class BaekJun14935 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger num = sc.nextBigInteger();

        while (true) {
            String s = String.valueOf(num);
            BigInteger n = BigInteger.valueOf(s.charAt(0) - '0');
            BigInteger fx = n.multiply(BigInteger.valueOf(s.length()));

            if (fx.equals(num)) {
                break;
            }
            num = fx;
        }
        System.out.println("FA");
    }
}

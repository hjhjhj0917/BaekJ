import java.math.BigInteger;
import java.util.Scanner;

public class BaekJun15700 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger width = sc.nextBigInteger();
        BigInteger height = sc.nextBigInteger();

        BigInteger wall = width.multiply(height);
        int tile = 2;
        System.out.println(wall.divide(BigInteger.valueOf(tile)));
    }
}

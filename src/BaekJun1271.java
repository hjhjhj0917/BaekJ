import java.math.BigInteger;
import java.util.Scanner;

public class BaekJun1271 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger coin = sc.nextBigInteger();
        BigInteger man = sc.nextBigInteger();

        System.out.println(coin.divide(man));
        System.out.println(coin.remainder(man));
    }
}

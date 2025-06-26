import java.math.BigInteger;
import java.util.Scanner;

public class BaekJun2420 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger num1 = sc.nextBigInteger();
        BigInteger num2 = sc.nextBigInteger();

        BigInteger num3 = num1.subtract(num2);
        System.out.println(num3.abs());
    }
}

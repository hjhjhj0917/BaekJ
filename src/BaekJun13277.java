import java.math.BigInteger;
import java.util.Scanner;

public class BaekJun13277 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger num1 = sc.nextBigInteger();
        BigInteger num2 = sc.nextBigInteger();

        System.out.println(num1.multiply(num2));
    }
}

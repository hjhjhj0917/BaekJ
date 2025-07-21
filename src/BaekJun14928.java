import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BaekJun14928 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        BigInteger num1 = new BigInteger(input);
        BigInteger num2 = new BigInteger("20000303");

        System.out.println(num1.mod(num2));
    }
}

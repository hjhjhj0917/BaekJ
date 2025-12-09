import java.util.Scanner;

public class BaekJun21335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long area = sc.nextLong();

        double result = 2 * Math.PI * Math.sqrt(area / Math.PI);

        System.out.printf("%.9f", result);
    }
}

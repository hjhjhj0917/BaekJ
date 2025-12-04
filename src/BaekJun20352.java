import java.util.Scanner;

public class BaekJun20352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long circleArea = sc.nextLong();

        double result = 2 * Math.PI * Math.sqrt(circleArea / Math.PI);

        System.out.printf("%.9f", result);
    }
}

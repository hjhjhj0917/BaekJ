import java.util.Scanner;

public class BaekJun20353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long squareArea = sc.nextLong();

        double result = Math.sqrt(squareArea) * 4;

        System.out.printf("%.8f", result);
    }
}

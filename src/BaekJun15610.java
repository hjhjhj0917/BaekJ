import java.util.Scanner;

public class BaekJun15610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double extent = sc.nextDouble();
        double side = Math.sqrt(extent);

        System.out.printf("%.8f", side * 4);
    }
}

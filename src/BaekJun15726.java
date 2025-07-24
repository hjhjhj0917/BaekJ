import java.util.Scanner;

public class BaekJun15726 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        int result1 = (int)((n1 * n2) / n3);
        int result2 = (int)((n1 / n2) * n3);
        int result = Math.max(result1, result2);

        System.out.println(result);
    }
}

import java.util.Scanner;

public class BaekJun30030 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        int result = (int) Math.round(price / 1.1);
        System.out.println(result);
    }
}

import java.util.Scanner;

public class BaekJun15964 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 <= 1000 && num2 <= 1000) {
            int res = (num1 + num2) * (num1 - num2);
            System.out.println(res);
        }
    }
}
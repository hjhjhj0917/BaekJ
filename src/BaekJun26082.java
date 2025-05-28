import java.util.Scanner;

public class BaekJun26082 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int res = (num2 / num1) * 3 * num3;
        System.out.println(res);
    }
}

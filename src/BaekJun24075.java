import java.util.Scanner;

public class BaekJun24075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(Math.max(num1 + num2, num1 - num2) + "\n" + Math.min(num1 + num2, num1 - num2));
    }
}

import java.util.Scanner;

public class BaekJun2609 {

    public static int gcd(int num1, int num2) { // 최대공약수을 구하는 메서드
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int lcm(int num1, int num2) { // 최소공배수를 구하는 메서드
        return num1 * num2 / gcd(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(gcd(num1, num2));
        System.out.println(lcm(num1, num2));
    }
}

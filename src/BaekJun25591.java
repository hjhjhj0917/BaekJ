import java.util.Scanner;

public class BaekJun25591 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a  = 100 - num1;
        int b = 100 - num2;
        int c = 100 - (a + b);
        int d = a * b;
        int q = (a * b) / 100;
        int r = (a * b) % 100;

        System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
        System.out.println(c + q + " " + r);
    }
}

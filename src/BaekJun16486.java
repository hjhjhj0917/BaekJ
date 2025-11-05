import java.util.Scanner;

public class BaekJun16486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int radius = sc.nextInt();
        double PI = 3.141592;

        System.out.println((2 * radius * PI) + (2 * width));
    }
}

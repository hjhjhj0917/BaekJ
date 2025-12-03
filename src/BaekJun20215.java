import java.util.Scanner;

public class BaekJun20215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();

        double result = (width + height) - Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println(result);
    }
}

import java.util.Scanner;

public class BaekJun17874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int height = sc.nextInt();
        int width = sc.nextInt();

        int result = Math.max(len-height, height) * Math.max(len-width, width) * 4;

        System.out.println(result);
    }
}

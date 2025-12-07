import java.util.Scanner;

public class BaekJun20833 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;

        for (int i = 0; i < num; i++) {

            result += (int) Math.pow(i+1, 3);
        }

        System.out.println(result);
    }
}

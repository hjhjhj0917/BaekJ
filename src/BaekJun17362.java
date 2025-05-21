import java.util.Scanner;

public class BaekJun17362 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = num % 8;

        if (result == 0) {
            System.out.println(2);
        } else if (result == 7) {
            System.out.println(3);
        } else if (result == 6) {
            System.out.println(4);
        } else {
            System.out.println(result);
        }
    }
}

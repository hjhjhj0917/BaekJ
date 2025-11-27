import java.util.Scanner;

public class BaekJun19602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int small = sc.nextInt();
        int medium = sc.nextInt();
        int large = sc.nextInt();

        int result = small + (2 * medium) + (3 * large);

        if (result >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}

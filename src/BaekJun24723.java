import java.util.Scanner;

public class BaekJun24723 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int floor = sc.nextInt();

        if (floor == 1) {
            System.out.println(2);
        } else {
            System.out.println((int)Math.pow(2, floor));
        }
    }
}

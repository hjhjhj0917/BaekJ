import java.util.Scanner;

public class BaekJun16394 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        int res = 1946 - year;
        System.out.println(Math.abs(res));
    }
}

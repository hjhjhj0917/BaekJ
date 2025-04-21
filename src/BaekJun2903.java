import java.util.Scanner;

public class BaekJun2903 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int point = 2;

        for (int i = 1; i <= num; i++) {
            point = (2 * point) - 1;
        }
        System.out.println((int) Math.pow(point, 2));
        sc.close();
    }
}

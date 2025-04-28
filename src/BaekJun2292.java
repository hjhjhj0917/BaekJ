import java.util.Scanner;

public class BaekJun2292 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int range = 1;
        int bee = 1;

        while (num > bee) {
            bee += 6 * range;
            range++;
        }
        System.out.println(range);
        sc.close();
    }
}

import java.util.Scanner;

public class BaekJun22279 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        double res = 0;

        for (int i = 0; i < num; i++) {

            double quality = sc.nextDouble();
            double year = sc.nextDouble();

            res += (quality * year);
        }

        System.out.printf("%.3f" , res);
    }
}

import java.util.Scanner;

public class BaekJun2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int res = 1 - num;

        for (int i = 0; i < num; i++) {

            int outletNum = sc.nextInt();

            res += outletNum;
        }

        System.out.println(res);
    }
}

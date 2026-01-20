import java.util.Scanner;

public class BaekJun2921 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      이번에는 성공하길!

        int num = sc.nextInt();
        int increase = 0;
        int result = 0;

        for (int i = 0; i < num; i ++) {

            increase += 3 + (3 * i);
            result += increase;
        }

        System.out.println(result);
        sc.close();
    }
}

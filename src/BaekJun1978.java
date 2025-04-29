import java.util.Scanner;

public class BaekJun1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int res = 0;
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            int count = 0;
            int n = sc.nextInt();

            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                res++;
            }
        }
        System.out.println(res);
    }
}

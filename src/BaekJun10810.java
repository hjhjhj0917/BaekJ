import java.util.Arrays;
import java.util.Scanner;

public class BaekJun10810 {

    // 바구니와 숫자공을 채울 바구니 수를 지정해서 바구니에 숫자 공을 채우는데 각 바구니에는
    // 공이 한개만 들어가고 이미 바구니에 공이 있으면 새로운 공을 넣고 기존 공을 빼서 각 바구니에
    // 어떤 공이 들어있는지 출력하는 프로그램을 작성하시오,

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().trim();
        String[] str = line.split(" ");

        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        int[] res = new int[num1];

        for (int i = 0; i < num2; i++) {

            String line2 = sc.nextLine().trim();
            String[] str2 = line2.split(" ");

            int a = Integer.parseInt(str2[0]);
            int b = Integer.parseInt(str2[1]);
            int c = Integer.parseInt(str2[2]);

            for (int j = a-1; j <= b-1; j++) {

                res[j] = c;
            }
        }
        for (int i = 0; i < res.length; i++) {

            if (i < res.length - 1) {
                System.out.print(res[i] + " ");
            }
            if (i == res.length - 1) {
                System.out.print(res[i]);
            }
        }
        sc.close();
    }
}

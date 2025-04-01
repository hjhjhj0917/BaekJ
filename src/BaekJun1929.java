import java.util.ArrayList;
import java.util.Scanner;

public class BaekJun1929 {

    // M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");

        ArrayList<Integer> arr = new ArrayList<>();
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        for (int i = num1; i <= num2; i++) {
            int count = 0;

            if (i == 1) {
                continue;
            }
            for (int j = 2; j * j <= num2; j++) {
                if (i % j == 0 && j != i) {
                    count++;
                }
            }
            if (count == 0) {
                arr.add(i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        sc.close();
    }
}

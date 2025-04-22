import java.util.Arrays;
import java.util.Scanner;

public class BaekJun10809 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String alp = "abcdefghijklmnopqrstuvwxyz";
        String line = sc.nextLine();

        String[] alpStr = alp.split("");
        String[] str = line.split("");
        int[] res = new int[alpStr.length];

        for (int i = 0; i < alpStr.length; i++) {
            res[i] = -1;
            for (int j = 0; j < str.length; j++) {

                if (res[i] > -1) {
                    continue;
                }
                if (str[j].equals(alpStr[i])) {
                    res[i] = j;
                }
            }
        }
        for (int i = 0; i < alpStr.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}

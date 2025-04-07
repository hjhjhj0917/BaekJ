import java.util.Scanner;

public class BaekJun3003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] str = line.split(" ");
        int[] che = {1, 1, 2, 2, 2, 8};
        int[] res = new int[che.length];

        for (int i = 0; i < che.length; i++) {

            int num = Integer.parseInt(str[i]);
            res[i] = che[i] - num;
        }
        for (int i = 0; i < che.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}

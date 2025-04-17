import java.util.Scanner;

public class BaekJun2720 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] change = {25, 10, 5, 1};
        int[][] res = new int[num][4];
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            int cent = sc.nextInt();

            for (int j = 0; j < 4; j++) {
                res[i][j] = cent / change[j];
                cent %= change[j];
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

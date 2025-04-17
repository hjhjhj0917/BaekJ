import java.util.Scanner;

public class BaekJun2563 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] pos = new int[101][101];
        int count = 0;

        for (int i = 0; i < num; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            for (int j = n1; j < n1 + 10; j++) {
                for (int k = n2; k < n2 + 10; k++) {
                    pos[k][j] = 1;
                }
            }
        }
        for (int i = 0; i < pos.length; i++) {
            for (int j = 0; j < pos[i].length; j++) {
                if (pos[i][j] != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

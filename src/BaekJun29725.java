import java.util.Arrays;
import java.util.Scanner;

public class BaekJun29725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] chess = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chess[i][j] = sc.nextLine();
            }
        }
        String[] flat = Arrays.stream(chess)
                .flatMap(Arrays::stream)
                .toArray(String[]::new);

        Arrays.sort(flat);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println(chess[i][j]);
            }
        }
    }
}

import java.util.Scanner;

public class BaekJun21665 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int width = sc.nextInt();
        int result = 0;

        boolean[][] pixels = new boolean[height][width];

        sc.nextLine();

        for (int i = 0; i < height; i++) {

            String line = sc.nextLine();

            for (int j = 0; j < width; j++) {

                if (line.charAt(j) == 'W') {
                    pixels[i][j] = true;
                }
            }
        }

        sc.nextLine();

        for (int i = 0; i < height; i++) {

            String line = sc.nextLine();

            for (int j = 0; j < width; j++) {

                boolean cmp = line.charAt(j) == 'W';

                if (pixels[i][j] == cmp) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}

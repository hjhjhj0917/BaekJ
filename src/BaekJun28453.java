import java.util.Scanner;

public class BaekJun28453 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int levelNum = sc.nextInt();
        int[] result = new int[levelNum];

        for (int i = 0; i < levelNum; i++) {
            int level = sc.nextInt();

            if (level >= 300) {
                result[i] = 1;
            } else if (level >= 275) {
                result[i] = 2;
            } else if (level >= 250) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}

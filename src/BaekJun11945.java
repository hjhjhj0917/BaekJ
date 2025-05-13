import java.util.Scanner;

public class BaekJun11945 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();
        sc.nextLine();

        char[][] bread = new char[row][column];

        for (int i = 0; i < row; i++) {
            String line = sc.nextLine();

            for (int j = 0; j < line.length(); j++) {
                bread[i][j] = line.charAt(j);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = column - 1; j >= 0; j--) {
                System.out.print(bread[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}

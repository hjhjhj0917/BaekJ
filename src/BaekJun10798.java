import java.util.Scanner;

public class BaekJun10798 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String line = sc.nextLine();
            String[] str = line.split("");
            for (int j = 0; j < str.length; j++) {
                arr[i][j] = str[j];
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != null) {
                    System.out.print(arr[j][i]);
                }
            }
        }
        sc.close();
    }
}

import java.util.Scanner;

public class BaekJun2738 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int[][] arr1 = new int[num1][num2];
        int[][] arr2 = new int[num1][num2];
        int[][] arr3 = new int[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

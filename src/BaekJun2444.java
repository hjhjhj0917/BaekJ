import java.util.Scanner;

public class BaekJun2444 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < 2 * num - 1; i++) {
            if (i < num) {
                for (int j = num - 1; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = num - 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j < (num - 1) * 3 - (i % num); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

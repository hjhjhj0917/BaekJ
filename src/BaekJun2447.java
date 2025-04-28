import java.util.Scanner;

public class BaekJun2447 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0 ; i < num; i++) {
            if (i < num) {
                for (int j = 0; j < num; j++) {
                    if (i % 2 == 1) {
                        if (j % 3 == 1) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}

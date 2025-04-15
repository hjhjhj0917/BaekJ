import java.util.Scanner;

public class BaekJun2445 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i < num*2; i++) {
                if (i <= num) {
                    for (int j = 1; j < i+1; j++) {
                        System.out.print("*");
                    }
                    for (int j = 2*(num-i); j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j < i+1; j++) {
                        System.out.print("*");
                    }
                } else {
                    for (int j = i; j < (num*2); j++) {
                        System.out.print("*");
                    }
                    for (int j = 1; j <= 2*(i-num); j++) {
                        System.out.print(" ");
                    }
                    for (int j = i; j < (num*2); j++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
        }
    }
}

import java.util.Scanner;

public class BaekJun15232 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class BaekJun17903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int clause = sc.nextInt();
        int variable = sc.nextInt();

        for (int i = 0; i < clause; i++) {
            for (int j = 0; j < 3; j++) {

                int var1 = sc.nextInt();
            }
        }

        if (clause >= 8) {
            System.out.println("satisfactory");
        } else {
            System.out.println("unsatisfactory");
        }
    }
}

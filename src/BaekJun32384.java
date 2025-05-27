import java.util.Scanner;

public class BaekJun32384 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "LoveisKoreaUniversity";
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if (i == num-1) {
                System.out.print(str);
            } else {
            System.out.print(str + " ");
            }
        }
    }
}

import java.util.Scanner;

public class BaekJun13118 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] mans = new int[4];
        int result = 0;

        for (int i = 0; i < mans.length; i++) {
            int man = sc.nextInt();
            mans[i] = man;
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        for (int i = 0; i < mans.length; i++) {
            if (mans[i] == x) {
                result = i + 1;
                break;
            }
        }
        System.out.println(result);
    }
}

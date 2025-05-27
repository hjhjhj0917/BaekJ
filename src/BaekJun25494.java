import java.util.Scanner;

public class BaekJun25494 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] result = new int[num];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num; i++) {
            int n1 = sc.nextInt();
            if (n1 < min) {
                min = n1;
            }
            int n2 = sc.nextInt();
            if (n2 < min) {
                min = n2;
            }
            int n3 = sc.nextInt();
            if (n3 < min) {
                min = n3;
            }
            result[i] = min;
            min = Integer.MAX_VALUE;
        }
        for (int i = 0; i < num; i++) {
            System.out.println(result[i]);
        }
    }
}

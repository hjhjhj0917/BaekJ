import java.util.Scanner;

public class BaekJun1547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] cups = new int[3];

        cups[0] = 1;

        for (int i = 0; i < num; i++) {

            int first = sc.nextInt();
            int second = sc.nextInt();
            int storage = 0;

            storage = cups[first-1];
            cups[first-1] = cups[second-1];
            cups[second-1] = storage;
        }

        for (int i = 0; i < 3; i++) {

            if (cups[i] == 1) {
                System.out.println(i+1);
                break;
            }
        }
    }
}

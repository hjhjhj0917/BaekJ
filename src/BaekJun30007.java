import java.util.ArrayList;
import java.util.Scanner;

public class BaekJun30007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < num; i++) {
            int raGae = sc.nextInt();
            int water = sc.nextInt();
            int raNum = sc.nextInt();

            int res = raGae * (raNum - 1) + water;
            list.add(res);
        }
        for (int result : list) {
            System.out.println(result);
        }
    }
}

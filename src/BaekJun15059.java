import java.util.Scanner;

public class BaekJun15059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] menus = new int[3];
        int[] needs = new int[3];
        int res = 0;

        for (int i = 0; i < menus.length; i++) menus[i] = sc.nextInt();
        for (int i = 0; i < menus.length; i++) needs[i] = sc.nextInt();

        for (int i = 0; i < 3; i++) {

            if (menus[i] - needs[i] < 0) res += Math.abs(menus[i] - needs[i]);
        }

        System.out.println(res);

    }
}

import java.util.Scanner;

public class BaekJun28295 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] direct = {"N", "E", "S", "W"};
        String res = "N";
        int loc = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num == 1) {
                res = direct[(loc + num)%4];
            } else if (num == 2) {
                res = direct[(loc + num)%4];
            } else if (num == 3) {
                res = direct[(loc + num)%4];
            }
            loc += num;
        }
        System.out.println(res);
        sc.close();
    }
}
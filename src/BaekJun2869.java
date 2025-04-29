import java.util.Scanner;

public class BaekJun2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int up = sc.nextInt();
        int down = sc.nextInt();
        int height = sc.nextInt();
        int res = 0;

        if ((height - down) % (up - down) == 0) {
            res = (height - down) / (up - down);
        } else {
            res = (height - down) / (up - down) +1;
        }
        System.out.println(res);
    }
}

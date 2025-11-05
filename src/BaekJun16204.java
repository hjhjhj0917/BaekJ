import java.util.Scanner;

public class BaekJun16204 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cardNum = sc.nextInt();
        int frontCircle = sc.nextInt();
        int backCircle = sc.nextInt();
        int res = 0;

        if (frontCircle == backCircle) {
            res = cardNum;
        } else if (frontCircle > backCircle) {
            res = backCircle + cardNum - frontCircle;
        } else {
            res = frontCircle + cardNum - backCircle;
        }
        System.out.println(res);
    }
}

import java.util.Scanner;

public class BaekJun15727 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int  distance = sc.nextInt();
        int res = 0;

        if (distance % 5 != 0) {
            res = distance / 5 + 1;
        } else {
            res = distance / 5;
        }
        System.out.println(res);
    }
}

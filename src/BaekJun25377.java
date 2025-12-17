import java.util.Scanner;

public class BaekJun25377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= num; i++) {

            int distance = sc.nextInt();
            int time = sc.nextInt();

            if (distance <= time && min > time) min = time;
        }

        if (min == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(min);
    }
}

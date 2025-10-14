import java.util.Scanner;

public class BaekJun15080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String start = sc.nextLine();
        String end = sc.nextLine();
        int[] strTimes = new int[3];
        int[] endTimes = new int[3];
        int strTotalTime = 0;
        int endTotalTime = 0;
        int res = 0;

        for (int i = 0; i < 3; i++) {

            strTimes[i] = Integer.parseInt(start.split(" : ")[i]);
            endTimes[i] = Integer.parseInt(end.split(" : ")[i]);
        }

        for (int i = 0; i < 3; i++) {

            strTotalTime += strTimes[i] * (Math.pow(60, (2 - i)));
            endTotalTime += endTimes[i] * (Math.pow(60, (2 - i)));
        }

        res = endTotalTime - strTotalTime;

        if (strTotalTime > endTotalTime) {
            System.out.println((int) (res + (24 * Math.pow(60, 2))));
        } else {
            System.out.println(res);
        }

    }
}

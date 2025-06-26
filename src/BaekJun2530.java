import java.util.Scanner;

public class BaekJun2530 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        int duration = sc.nextInt();

        int allTime = hour * 3600 + minute * 60 + second + duration;

        hour = allTime / 3600;
        minute = (allTime % 3600) / 60;
        second = (allTime % 3600) % 60;

        if (hour >= 24) {
            hour = hour % 24;
        }

        System.out.println(hour + " " + minute + " " + second);
    }
}

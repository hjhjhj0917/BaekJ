import java.util.Scanner;

public class BaekJun21638 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int todayTemp = sc.nextInt();
        int todayWind = sc.nextInt();
        int tomorrowTemp = sc.nextInt();
        int tomorrowWind = sc.nextInt();

        if (tomorrowTemp < 0 && tomorrowWind >= 10) {
            System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
        } else if (tomorrowTemp < todayTemp) {
            System.out.println("MCHS warns! Low temperature is expected tomorrow.");
        } else if (tomorrowWind > todayWind) {
            System.out.println("MCHS warns! Strong wind is expected tomorrow.");
        } else {
            System.out.println("No message");
        }
    }
}

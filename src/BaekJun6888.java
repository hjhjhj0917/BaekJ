import java.util.Scanner;

public class BaekJun6888 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentYear = sc.nextInt();
        int futureYear = sc.nextInt();
        int LCM = 60;

        for (int i = currentYear; i <= futureYear; i+=LCM) {

            System.out.println("All positions change in year " + i);
        }
    }
}

import java.util.Scanner;

public class BaekJun21612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int boilTemp = sc.nextInt();

        if (boilTemp < 80 || boilTemp >200) return;

        int atmPressure = (5 * boilTemp) - 400;

        if (atmPressure > 100) {
            System.out.println(atmPressure + "\n" + -1);
        } else if (atmPressure < 100) {
            System.out.println(atmPressure + "\n" + 1);
        } else {
            System.out.println(atmPressure + "\n" + 0);
        }
    }
}

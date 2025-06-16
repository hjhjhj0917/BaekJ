import java.util.Scanner;

public class BaekJun28113 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int walk = sc.nextInt();
        int bus = sc.nextInt();
        int subway = sc.nextInt();

        if (bus < walk) {
            System.out.println("Bus");
        } else if (bus == walk) {
            if (bus == subway) {
                System.out.println("Anything");
            } else {
                System.out.println("Bus");
            }
        } else {
            if (bus == subway) {
                System.out.println("Anything");
            } else if (bus > subway) {
                System.out.println("Subway");
            } else {
                System.out.println("Bus");
            }
        }
    }
}

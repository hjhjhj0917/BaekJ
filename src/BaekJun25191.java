import java.util.Scanner;

public class BaekJun25191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chicken = sc.nextInt();
        int coke = sc.nextInt();
        int bear = sc.nextInt();

        if (chicken >= (coke/2) + bear) {
            System.out.println((coke/2) + bear);
        } else {
            System.out.println(chicken);
        }
    }
}

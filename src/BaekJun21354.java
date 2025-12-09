import java.util.Scanner;

public class BaekJun21354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int appleNum = sc.nextInt();
        int pealNum = sc.nextInt();

        if (appleNum * 7 > pealNum * 13) {
            System.out.println("Axel");
        } else if (appleNum * 7 < pealNum * 13) {
            System.out.println("Petra");
        } else {
            System.out.println("lika");
        }
    }
}

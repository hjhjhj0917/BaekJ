import java.util.Scanner;

public class BaekJun17256 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aNum1 = sc.nextInt();
        int aNum2 = sc.nextInt();
        int aNum3 = sc.nextInt();

        int cNum1 = sc.nextInt();
        int cNum2 = sc.nextInt();
        int cNum3 = sc.nextInt();

        int bNum1 = cNum1 - aNum3;
        int bNum2 = cNum2 / aNum2;
        int bNum3 = cNum3 - aNum1;
        System.out.println(bNum1 + " " + bNum2 + " " + bNum3);
    }
}

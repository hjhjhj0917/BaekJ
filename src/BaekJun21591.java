import java.util.Scanner;

public class BaekJun21591 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int computerW = sc.nextInt();
        int computerH = sc.nextInt();
        int stickerW = sc.nextInt();
        int stickerH = sc.nextInt();

        if (computerW - stickerW >= 2 && computerH - stickerH >= 2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

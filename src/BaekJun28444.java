import java.util.Scanner;

public class BaekJun28444 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int i = sc.nextInt();
        int a = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        int hi = h * i;
        int arc = a * r * c;
        System.out.println(hi - arc);
    }
}

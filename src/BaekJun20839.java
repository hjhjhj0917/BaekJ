import java.util.Scanner;

public class BaekJun20839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if ((x < 1 || x > 30) || (y < 1 || y > 30) || (z < 1 || z > 30)) return;

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();

        if ((x1 < 0 || x1 > x) || (y1 < 0 || y1 > y) || (z1 < 0 || z1 > z)) return;

        if (x1 >= x && y1 >= y && z1 >= z) {
            System.out.println("A");
        } else if (x1 >= Math.ceil(x / 2.0) && y1 >= y && z1 >= z) {
            System.out.println("B");
        } else if (y1 >= y && z1 >= z) {
            System.out.println("C");
        } else if (y1 >= Math.ceil(y / 2.0) && z1 >= z) {
            System.out.println("D");
        } else if (z1 >= z) {
            System.out.println("E");
        }
    }
}

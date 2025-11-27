import java.util.Scanner;

public class BaekJun18414 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();
        int min = sc.nextInt();
        int max = sc.nextInt();

        if (min <= val && val <= max) {
            System.out.println(val);
        } else {
            if (Math.abs(val - min) > Math.abs(val - max) ) {
                System.out.println(max);
            } else {
                System.out.println(min);
            }
        }
    }
}

import java.util.Scanner;

public class BaekJun15963 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long me = sc.nextLong();
        long teacher = sc.nextLong();

        if (me == teacher) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

import java.util.Scanner;

public class BaekJun24072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrive = sc.nextInt();
        int leave = sc.nextInt();
        int visit = sc.nextInt();

        if (arrive <= visit && leave > visit) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

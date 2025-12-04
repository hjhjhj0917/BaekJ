import java.util.Scanner;

public class BaekJun20492 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int prize = sc.nextInt();

        int res1 = prize - (int)(prize * 0.22);
        int res2 = prize - (int)((prize * 0.20) * 0.22);
        System.out.println(res1 + " " + res2);
    }
}

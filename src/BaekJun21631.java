import java.util.Scanner;

public class BaekJun21631 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long whiteHorse = sc.nextLong();
        long blackHorse = sc.nextLong();

        System.out.println(Math.min(blackHorse, whiteHorse + 1));
    }
}

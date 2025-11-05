import java.util.Scanner;

public class BaekJun16430 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mole = sc.nextInt();
        int denom = sc.nextInt();

        int resMole = denom - mole;
        System.out.println(resMole + " " + denom);
    }
}

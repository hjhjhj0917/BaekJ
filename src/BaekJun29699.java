import java.util.Scanner;

public class BaekJun29699 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "WelcomeToSMUPC";
        int num = sc.nextInt();

        System.out.println(str.charAt((num - 1) % str.length()));
    }
}

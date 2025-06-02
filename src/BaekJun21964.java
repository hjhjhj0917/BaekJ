import java.util.Scanner;

public class BaekJun21964 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int strLength = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        String result = "";
        for (int i = strLength - 5; i < strLength; i++) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}

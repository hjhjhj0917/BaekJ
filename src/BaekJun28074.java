import java.util.Scanner;

public class BaekJun28074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String mobis = "MOBIS";

        for (int i = 0; i < str.length(); i++) {
            mobis = mobis.replaceAll(str.charAt(i) + "", "");
        }
        if (mobis.length() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

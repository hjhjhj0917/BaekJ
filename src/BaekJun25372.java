import java.util.ArrayList;
import java.util.Scanner;

public class BaekJun25372 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();
        ArrayList<String> res = new ArrayList<String>();

        for (int i = 0; i < num; i++) {
            String pw = sc.nextLine();

            if (pw.length() >= 6 && pw.length() <= 9) {
                res.add("yes");
            } else {
                res.add("no");
            }
        }
        for (String s : res) {
            System.out.println(s);
        }
    }
}

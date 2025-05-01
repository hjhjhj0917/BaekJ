import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class BaekJun4101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> res = new ArrayList<String>();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] str = line.split(" ");

            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[1]);

            if (num1 == 0 && num2 == 0) {
                break;
            }
            if (num1 > num2) {
                res.add("Yes");
            } else {
                res.add("No");
            }
        }
        for (String str : res) {
            System.out.println(str);
        }
    }
}

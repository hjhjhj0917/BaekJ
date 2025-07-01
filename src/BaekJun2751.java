import java.util.ArrayList;
import java.util.Scanner;

public class BaekJun2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Character> chars = new ArrayList<Character>();

        while (sc.hasNext()) {
            String num = sc.nextLine();
            chars.add(num.charAt(0));

            if(num.isEmpty()) {
                break;
            }
        }
        for (int i = 0; i < chars.size(); i++) {

        }
    }
}

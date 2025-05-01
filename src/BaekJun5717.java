import java.util.ArrayList;
import java.util.Scanner;

public class BaekJun5717 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> res = new ArrayList<Integer>();

        while (sc.hasNext()) {
            int man = sc.nextInt();
            int woman = sc.nextInt();

            if (man == 0 && woman == 0) {
                break;
            }
            res.add(man + woman);
        }
        for (int friend : res) {
            System.out.println(friend);
        }
    }
}

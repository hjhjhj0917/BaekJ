import java.util.Random;
import java.util.Scanner;

public class BaekJun20336 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int setMenuNum = sc.nextInt();
        String[][] menu = new String[setMenuNum][];

        for (int i = 0; i < setMenuNum; i++) {
            int cnt = sc.nextInt();
            menu[i] = new String[cnt];

            for (int j = 0; j < cnt; j++) {
                menu[i][j] = sc.next();
            }
        }

        int randNum = random.nextInt(setMenuNum);

        System.out.println(menu[randNum].length);

        for (int i = 0; i < menu[randNum].length; i++) {
            System.out.println(menu[randNum][i]);
        }
    }
}

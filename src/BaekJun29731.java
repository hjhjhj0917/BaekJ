import java.util.List;
import java.util.Scanner;

public class BaekJun29731 {

    static class MemeCheck {
        String meme;

        MemeCheck(String meme) {
            this.meme = meme;
        }

        boolean check(String line) {
            return meme.equals(line);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<MemeCheck> mc = List.of(
                new MemeCheck("Never gonna give you up"),
                new MemeCheck("Never gonna let you down"),
                new MemeCheck("Never gonna run around and desert you"),
                new MemeCheck("Never gonna make you cry"),
                new MemeCheck("Never gonna say goodbye"),
                new MemeCheck("Never gonna tell a lie and hurt you"),
                new MemeCheck("Never gonna stop")
        );
        int num = sc.nextInt();
        int count = 0;
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            String line = sc.nextLine();

            for (MemeCheck m : mc) {

                if (m.check(line)) {
                    count++;
                    break;
                }
            }
        }

        if (count == num) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

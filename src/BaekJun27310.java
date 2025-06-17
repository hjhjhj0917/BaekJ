import java.util.Scanner;

public class BaekJun27310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String emote = sc.nextLine();
        int resultLevel = 0;
        int colonNum = 0;
        int underbarNum = 0;
        for (int i = 0; i < emote.length(); i++) {
            if (emote.charAt(i) == ':') {
                colonNum++;
            }
            if (emote.charAt(i) == '_') {
                underbarNum++;
            }
        }
        resultLevel = emote.length() + colonNum + (underbarNum * 5);
        System.out.println(resultLevel);
    }
}

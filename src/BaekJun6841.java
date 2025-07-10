import java.util.Scanner;

public class BaekJun6841 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNext()) {
            String word = sc.nextLine();

            if (word.equals("TTYL")) {

                sb.append("talk to you later");
                break;
            }

            if (word.equals("CU")) sb.append("see you" + "\n");
            else if (word.equals(":-)")) sb.append("I’m happy" + "\n");
            else if (word.equals(":-(")) sb.append("I’m unhappyy" + "\n");
            else if (word.equals(";-)")) sb.append("wink" + "\n");
            else if (word.equals(":-P")) sb.append("stick out my tongue" + "\n");
            else if (word.equals("(~.~)")) sb.append("sleepy" + "\n");
            else if (word.equals("TA")) sb.append("totally awesome" + "\n");
            else if (word.equals("CCC")) sb.append("Canadian Computing Competition" + "\n");
            else if (word.equals("CUZ")) sb.append("because" + "\n");
            else if (word.equals("TY")) sb.append("thank-you" + "\n");
            else if (word.equals("YW")) sb.append("you’re welcome" + "\n");
            else sb.append(word + "\n");
        }

        System.out.println(sb);
    }
}

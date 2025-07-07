import java.util.Scanner;

public class BaekJun5358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNextLine()) {

            String line = sc.nextLine();

            if (line.length() == 0) break;

            String result = "";

            for (int i = 0; i < line.length(); i++) {

                if (line.charAt(i) == 'i') {
                    result += "e";
                } else if (line.charAt(i) == 'e') {
                    result += "i";
                } else if (line.charAt(i) == 'I') {
                    result += "E";
                } else if (line.charAt(i) == 'E') {
                    result += "I";
                } else {
                    result += line.charAt(i);
                }
            }

            sb.append(result + "\n");
        }

        System.out.println(sb);
    }
}

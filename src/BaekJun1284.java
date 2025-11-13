import java.util.Scanner;

public class BaekJun1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNext()) {

            String addr = sc.nextLine();
            int result = 2;

            if (addr.equals("0")) break;

            for (int i = 0; i < addr.length(); i++) {

                if (addr.charAt(i) == '1') {
                    result += 2;
                } else if (addr.charAt(i) == '0') {
                    result += 4;
                } else {
                    result += 3;
                }
            }

            result += addr.length() - 1;

            sb.append(result + "\n");
        }

        System.out.println(sb);
    }
}

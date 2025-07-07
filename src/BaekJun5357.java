import javax.sound.sampled.Line;
import java.util.Scanner;

public class BaekJun5357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {

            String line = sc.nextLine().toUpperCase();
            String result = "" + line.charAt(0);

            for (int j = 0; j < line.length()-1; j++) {

                if (line.charAt(j) != line.charAt(j+1)) {
                    result += line.charAt(j+1);
                }
            }
            sb.append(result + "\n");
        }

        System.out.println(sb);
    }
}

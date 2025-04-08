import java.util.Arrays;
import java.util.Scanner;

public class BaekJun9086 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String[] str = new String[num*2];
        sc.nextLine();

        for (int i = 0; i < num; i++) {

            String line = sc.nextLine().trim();
            String[] str1 = line.split("");

            str[i+i] = str1[0];
            str[i+i+1] = str1[str1.length-1];
        }
        for (int i = 0; i < num; i++) {
            System.out.println(str[i+i] + str[i+i+1]);
        }
    }
}

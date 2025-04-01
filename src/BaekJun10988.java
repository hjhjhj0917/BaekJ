import java.util.Objects;
import java.util.Scanner;

public class BaekJun10988 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] str = line.split("");

        int res = 1;

        for (int i = 0; i < str.length / 2; i++) {

            if (Objects.equals(str[i], str[str.length - (i+1)])) {

            }
            else{
                res = 0;
                break;
            }
        }
        sc.close();
        System.out.println(res);
    }
}

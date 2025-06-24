import java.util.Scanner;

public class BaekJun23825 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sNum = sc.nextInt();
        int aNum = sc.nextInt();
        int result = 0;

        if (sNum >= 2 && aNum >= 2) {
            if (sNum / 2 >= aNum / 2) {
                result = aNum / 2;
            } else {
                result = sNum / 2;
            }
        }
        System.out.println(result);
    }
}

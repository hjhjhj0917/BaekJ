import java.util.Scanner;

public class BaekJun27110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chickenNum = sc.nextInt();
        int result = 0;
        for (int i = 0; i < 3; i++) {
            int preferenceNum = sc.nextInt();

            if (preferenceNum >= chickenNum) {
                result += chickenNum;
            } else {
                result += preferenceNum;
            }
        }
        System.out.println(result);
    }
}

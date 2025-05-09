import java.util.Scanner;

public class BaekJun11282 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        char result = (char) (0xAC00 + num - 1);
        // char result = (char) (0xAC00 + (초성 * 21 + 중성) * 28 + 종성); 유니코드로 한글으 구하는 법
        System.out.println(result);
    }
}

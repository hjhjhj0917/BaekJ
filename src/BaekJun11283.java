import java.util.Scanner;

public class BaekJun11283 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char word = sc.next().charAt(0);

        int result = (int) (word) - 0xAC00 + 1;
        System.out.println(result);
    }
}

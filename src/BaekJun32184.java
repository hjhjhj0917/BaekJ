import java.util.Scanner;

public class BaekJun32184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startPage = sc.nextInt();
        int endPage = sc.nextInt();
        int result = (endPage - startPage) / 2;

        if (startPage % 2 != 0 && endPage % 2 == 0) {
            result += 1;
        } else if (startPage % 2 == 0 || endPage % 2 != 0) {
            result += 2;
        } else {
            result += 1;
        }

        System.out.println(result);

        sc.close();
    }
}

import java.util.Scanner;

public class BaekJun26068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int emoteNum = sc.nextInt();
        int result = 0;
        sc.nextLine();

        for (int i = 0; i < emoteNum; i++) {
            String exprDate = sc.nextLine();

            int date = Integer.parseInt(exprDate.substring(2));
            if (date <= 90) {
                result++;
            }
        }
        System.out.println(result);
    }
}

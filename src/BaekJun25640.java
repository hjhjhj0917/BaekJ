import java.util.Scanner;

public class BaekJun25640 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String meMbti = sc.nextLine();
        int friendNum = sc.nextInt();
        int result = 0;
        sc.nextLine();

        for (int i = 0; i < friendNum; i++) {
            String friendMbti = sc.nextLine();

            if (meMbti.equals(friendMbti)) {
                result++;
            }
        }
        System.out.println(result);
    }
}

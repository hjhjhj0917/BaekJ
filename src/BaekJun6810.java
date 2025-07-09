import java.util.Scanner;

public class BaekJun6810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int isbm = 0;
        String defaultNum = "9780921418";

        for (int i = 0; i < 3; i++) {

            String num = sc.nextLine();
            defaultNum += num;
        }

        for (int i = 0; i < defaultNum.length(); i++) {

            if ((i+1) % 2 != 0) {
                isbm += Integer.parseInt(String.valueOf(defaultNum.charAt(i)));
            } else {
                isbm += Integer.parseInt(String.valueOf(defaultNum.charAt(i))) * 3;
            }
        }

        System.out.println("The 1-3-sum is " + isbm);
    }
}

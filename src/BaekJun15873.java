import java.util.Scanner;

public class BaekJun15873 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int notZero = 0;

        String s = String.valueOf(num);
        int[] nums = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            nums[i] = s.charAt(i) - '0';
        }

        if (s.length() == 4) {
            System.out.println(20);
        } else if (s.length() == 3) {
            String e = s.replace("10", "");
            notZero = e.charAt(0) - '0';
            System.out.println(notZero + 10);
        } else {
            System.out.println(nums[0] + nums[1]);
        }
    }
}

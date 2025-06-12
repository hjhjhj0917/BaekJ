import java.util.Arrays;
import java.util.Scanner;

public class BaekJun10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            nums[i] = num;
        }
        Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}

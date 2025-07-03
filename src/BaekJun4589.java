import java.util.Arrays;
import java.util.Scanner;

public class BaekJun4589 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        result.append("Gnomes:" + "\n");

        int num = sc.nextInt();
        int[] nums = new int[3];
        int[] asc = new int[3];
        int[] desc = new int[3];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {

                nums[j] = sc.nextInt();
            }
            asc = Arrays.copyOf(nums, nums.length);
            Arrays.sort(asc);
            
            for (int j = 0; j < 3; j++) {
                
                desc[j] = asc[2-j];
            }
            
            if (Arrays.equals(nums, desc) || Arrays.equals(nums, asc)) {
                result.append("Ordered" + "\n");
            } else {
                result.append("Unordered" + "\n");
            }
        }

        System.out.println(result);
        sc.close();
    }
}

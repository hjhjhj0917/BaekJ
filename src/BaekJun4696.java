import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJun4696 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> nums = new ArrayList<>();

        while (sc.hasNext()) {

            double num = sc.nextDouble();

            if (num == 0) break;

            double sum = 1 + num + num*num + num*num*num + num*num*num*num;

            nums.add(sum);
        }

        for (double result : nums) {

            System.out.printf("%.2f\n", result);
        }
    }
}

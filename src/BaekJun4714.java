import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJun4714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> nums = new ArrayList<>();

        while (sc.hasNextDouble()) {

            Double weight = sc.nextDouble();

            if (weight < 0) break;

            nums.add(weight);
        }

        for (double result : nums) {

            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", result, result*0.167);
        }
    }
}

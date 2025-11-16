import java.util.Scanner;

public class BaekJun2460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] peopleNums = new int[10];
        int hap = 0;

        for (int i = 0; i < 10; i++) {

            int offNum = sc.nextInt();
            int onNum = sc.nextInt();

            hap += onNum - offNum;

            peopleNums[i] = hap;
        }

        int result = peopleNums[0];

        for (int i = 1; i < 10; i++) result = Math.max(result, peopleNums[i]);

        System.out.println(result);
    }
}

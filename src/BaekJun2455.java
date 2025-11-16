import java.util.Scanner;

public class BaekJun2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] peopleNums = new int[4];
        int hap = 0;

        for (int i = 0; i < 4; i++) {

            int offNum = sc.nextInt();
            int onNum = sc.nextInt();

            hap += onNum - offNum;

            peopleNums[i] = hap;
        }

        int result = peopleNums[0];

        for (int i = 1; i < 4; i++) result = Math.max(result, peopleNums[i]);

        System.out.println(result);
    }
}

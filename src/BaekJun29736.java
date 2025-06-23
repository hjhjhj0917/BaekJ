import java.util.Scanner;

public class BaekJun29736 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();
        int solveNum = sc.nextInt();
        int range = sc.nextInt();

        int leftNum = Math.max(min, solveNum - range);
        int rightNum = Math.min(max, solveNum + range);

        if (leftNum > rightNum) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(rightNum - leftNum + 1);
        }

        sc.close();
    }
}

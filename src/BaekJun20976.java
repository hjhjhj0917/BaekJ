import java.util.Arrays;
import java.util.Scanner;

public class BaekJun20976 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] < 1 || arr[i] > 100) break;
        }

        Arrays.sort(arr);

        System.out.println(arr[1]);
    }
}

import java.util.Scanner;

public class BaekJun6764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[3];
        String result = "";
        int[] arr = new int[4];
        int depth = sc.nextInt();

        arr[0] = depth;

        for (int i = 1; i < arr.length; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] > arr[i - 1]) {
                str[i-1] = "Fish Rising";
            } else if (arr[i] < arr[i - 1]) {
                str[i-1] = "Fish Diving";
            } else if (arr[i] == arr[i - 1]) {
                str[i-1] = "Fish At Constant Depth";
            }
        }

        for (int i = 0; i < str.length-1; i++) {
            if (!str[i].equals(str[i+1])) {
                result = "No Fish";
                break;
            } else {
                result = str[i];
            }
        }

        System.out.println(result);
    }
}

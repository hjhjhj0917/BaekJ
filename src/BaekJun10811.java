import java.util.Scanner;

public class BaekJun10811 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] str = line.split(" ");

        int bas = Integer.parseInt(str[0]);
        int num = Integer.parseInt(str[1]);
        int[] arr = new int[bas];

        for (int i = 0; i < bas; i++) {

            arr[i] = i + 1;
        }
        for (int i = 0; i < num; i++) {

            String line1 = sc.nextLine();
            String[] str1 = line1.split(" ");

            int s1 = Integer.parseInt(str1[0]);
            int s2 = Integer.parseInt(str1[1]);

            while (s1 < s2) {

                int temp = arr[s1-1];
                arr[s1-1] = arr[s2-1];
                arr[s2-1] = temp;
                s1++;
                s2--;
            }
        }
        for (int i = 0; i < bas; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

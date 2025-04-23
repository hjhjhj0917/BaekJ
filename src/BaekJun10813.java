import java.util.Scanner;

public class BaekJun10813 {

    //  M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] line = str.split(" ");

        int num = Integer.parseInt(line[0]);
        int num2 = Integer.parseInt(line[1]);
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {

            arr[i] = i + 1;
        }
        for (int i = 0; i < num2; i++) {

            int s;
            String str2 = sc.nextLine();
            String[] line2 = str2.split(" ");

            int num3 = Integer.parseInt(line2[0]);
            int num4 = Integer.parseInt(line2[1]);

            s = arr[num3-1];
            arr[num3-1] = arr[num4-1];
            arr[num4-1] = s;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}

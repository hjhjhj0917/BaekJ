import java.util.Scanner;

public class BaekJun10950 {

    // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++){

            String num1 = sc.nextLine();
            String[] hap = num1.split(" ");

            int hap1 = Integer.parseInt(hap[0]);
            int hap2 = Integer.parseInt(hap[1]);

            arr[i] = hap1 + hap2;
        }
        for (int i = 0; i < num; i++){

            System.out.println(arr[i]);
        }
    }
}

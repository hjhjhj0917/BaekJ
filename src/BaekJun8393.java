import java.util.Scanner;

public class BaekJun8393 {

    // n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int hap = 0;

        for (int i = 1; i <= num; i++) {
            hap = hap + i;
        }
        System.out.println(hap);

    }
}

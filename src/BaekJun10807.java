import java.util.Scanner;

// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

public class BaekJun10807 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        String su = sc.nextLine();
        String[] su1 = su.split(" ");

        int num2 = sc.nextInt();
        int a = 0;

        for (int i = 0; i < num; i++) {

            int num3 = Integer.parseInt(su1[i]);

            if(num3 == num2){
                a = a + 1;
            }
        }
        System.out.println(a);
    }
}

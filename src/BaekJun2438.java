import java.util.Scanner;

// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 프로그램을 작성하시오.

public class BaekJun2438 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 1; i <= a; i++){ // 변수 i에 초깃값 설정 후, 사용자가 입력한 변수를 조건으로 하고,
                                     // 증감식 수행.
            for(int j = 1; j <= i; j++){  // 이중 for문을 사용함
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

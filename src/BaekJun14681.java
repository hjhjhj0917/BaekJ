import java.util.Scanner;

public class BaekJun14681 {

    // 좌표값을 입력하면 어느 n사 분면에 위치하는지 출력하는 프로그램을 작성하시오.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > 0 && b > 0){
            System.out.println("1");
        }else if(a < 0 && b > 0){
            System.out.println("2");
        }else if(a < 0 && b < 0){
            System.out.println("3");
        }else if(a > 0 && b < 0){
            System.out.println("4");
        }
        sc.close();

    }
}

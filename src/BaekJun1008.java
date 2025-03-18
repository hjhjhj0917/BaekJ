import java.util.Scanner;

public class BaekJun1008 {

    // 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // System.out.println("값을 입력하시오 : ");
        double a = sc.nextDouble();  // double을 사용하여 소수점이하 자리수까지 표현함

        // System.out.println("값을 입력하시오 : ");
        double b = sc.nextDouble();

        System.out.println(a / b);

    }
}

import java.util.Scanner;  // java.util 패키지에 있는 Scanner 클래스를 가져옴

public class BackJun1000 {

    // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // 사용자에게 값을 입력 받기 위해서 Scanner를 사용함

        // System.out.println("값을 입력하시오 : ");
        int a = sc.nextInt();  // Scanner에서 입력 받은 값을 int를 사용하여 정수형태로 변수 A에 넣음

        // System.out.println("값을 입력하시오 : ");
        int b = sc.nextInt();  // Scanner 에서 입력 받은 값을 int를 사용하여 정수형태로 변수 B에 넣음

        System.out.println(a + b);  // 입력 받은 정수값을 + 로 연산하여 출력함
    }
}

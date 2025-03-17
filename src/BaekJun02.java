import java.util.Scanner;

public class BaekJun02 {

    // 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("값을 입력하시오: ");
        int A = sc.nextInt();

        System.out.println("값을 입력하시오: ");
        int B = sc.nextInt();

        System.out.println(A - B);
    }
}

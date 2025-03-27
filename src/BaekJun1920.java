import java.util.HashSet;
import java.util.Scanner;

public class BaekJun1920 {

//    N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        HashSet<String> set = new HashSet<>();  // 존재 여부 빠른 검색용 HashSet클래스를 사용함(중복여부에도 활용가능)
                                                // <String> 문자열을 값으로 받음
        for (int i = 0; i < num; i++) {
            set.add(sc.next()); // set.add를 사용하여 HashSet에 입력값 저장 sc.next()는 공백(스페이스, 탭, 엔터) 전까지의 문자열을 읽음
        }

        int num1 = sc.nextInt();
        for (int i = 0; i < num1; i++) {
            System.out.println(set.contains(sc.next()) ? 1 : 0); // set.contains는 저장된 값이 존재하는지 확인
        }                                                        // 삼항연산자 ? : 을 사용해서 true면 : 오른쪽 값 false면 : 왼쪽값을 출력

        sc.close();
    }
}

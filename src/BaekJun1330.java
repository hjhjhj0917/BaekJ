import java.util.Scanner;

public class BaekJun1330 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b) {  // if조건문을 사용하여 상태에 다른 결과 같을 출력 하게만듬
            System.out.println(">");
        }else if(a<b) {  // 첫번째 조건이 아닌경우 두번째 조건을 실행
            System.out.println("<");
        } else {  // 모두 아니면 마지막 조건문 실행
            System.out.println("==");
        }
        sc.close();  // close를 통하여 정상적으로 종료
    }
}

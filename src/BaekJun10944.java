import java.util.Random;

public class BaekJun10944 {

    // 1부터 10,000까지 정수 중에서 하나를 출력하는 프로그램을 작성하시오.

    public static void main(String[] args){

        Random rd = new Random();  // Random 함수를 사용하여 랜덤으로 값을 불러옴

        int a = rd.nextInt(10000)+1;  // rd.nextInt() 괄호안에 값을 지정할수 있음
                                             // 예를 들어 10이면 0 ~ 9 따라서 + 1을 해주면 1부터 시작하는 값을 얻을 수 있음

        System.out.println(a);
    }

}

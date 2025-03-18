import java.util.Scanner;

// 세자리 수의 곱을 할때의 연산 과정을 출력하는 프로그램을 작성하시오.

public class BaekJun2588 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a * ((b%10)/1));  // 각 자리수의 수를 구하는 공식으로 1의 자리수는 10을 나눴을 때
                                             // 나머지를 1로 나눈 몫을 하는 공식
        System.out.println(a * ((b%100)/10));  // 각 자리수의 수를 구하는 공식으로 10의 자리수는 100을 나눴을 때
                                               // 나머지를 10로 나눈 몫을 하는 공식
        System.out.println(a * ((b%1000)/100));  // 각 자리수의 수를 구하는 공식으로 100의 자리수는 1000을 나눴을 때
                                                 // 나머지를 100로 나눈 몫을 하는 공식
        System.out.println(a * b);

    }
}

import java.util.Scanner;

public class BaekJun10871 {

    // 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때,
    // A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int x = sc.nextInt();
        sc.nextLine();  // nextLine()과 다른 next()를 사용하면 버퍼 문제가 발생 nextLine()은 enter를 써서 데이터를 버퍼에 저장하는데
                        // 다른 next()와 사용하면 버퍼에 데이터가 이미 저장되어 있어서 오류가 발생함
                        // 따라서 nextLine()을 한 번 더 사용하여 버퍼 데이터를 없애줘서 오류를 제거함
        String line = sc.nextLine();  // String을 사용해서 숫자를 문자열 형태로 받아 옴

        String[] words = line.split(" "); // String[]은 String만 담을 수 있는 배열이다
                                                // split(" ") 은 괄호안에 문자를 기준으로 구분하는 메서드이다
        for(int i = 0; i < cnt; i++) {

            int num = Integer.parseInt(words[i]);  // Integer클래스의 parseInt 메서드는 괄호안에 문자를 정수로 바꿔주는 메서드이다.
                                                   // words[i]의 i는 배열의 index 번호이다 words[i]는 index번호에 해당하는 words배열의 값을 나타낸다.
            if(num < x){
                System.out.print(num + " ");
            }

        }

    }
}

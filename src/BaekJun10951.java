import java.util.ArrayList;
import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

public class BaekJun10951 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(); // ArrayList는 동적으로 크기가 변하는 배열을 제공하는 클래스

        while (sc.hasNextLine()) {  // hasNext는 다음 입력값이 존재하는지 물어보는 메서드이다.

            String num = sc.nextLine().trim(); // trim은 양쪽 끝에 공백을 제거함
//            if (num.isEmpty()) {  // isEmpty는 num의 값이 비어있으면 true 비어있지 않으면 false
//                                  // equals("") 괄호안에 값이 같으면 true 다르면 false
//                break;
//            }
            String[] hap = num.split(" ");

            if (hap.length != 2) {
                break;
            }
            int num1 = Integer.parseInt(hap[0]);
            int num2 = Integer.parseInt(hap[1]);

            list.add(num1 + num2);  // ArrayList로 생성한 배열은 .add()메서드로 값을 추가한다.
        }
        for (int result : list) {  // 향상 for문으로 배열 또는 컬렉션의 각 요소를 차례대로 가져와 변수명에 저장하면서 반복
            System.out.println(result);
        }
        sc.close();
    }
}

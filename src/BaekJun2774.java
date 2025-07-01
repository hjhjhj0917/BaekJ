import java.util.Scanner;

public class BaekJun2774 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        StringBuilder res = new StringBuilder();
        // Stringbuilder 는 문자열을 효율적으로 수정할 수 있게 해주는 클래스이다.

        for (char ch : line.toCharArray()) { // 향상 for문을 사용해서, 입력받은 문자열을 char배열로 치환해서 char에 넣어서 하나씩 비교한다.
            if (Character.isUpperCase(ch)) { // 문자열 첫번째 단어가 대문자인지 확인
                res.append(Character.toLowerCase(ch)); // 대문자라면 소문자로 변경
            } else if (Character.isLowerCase(ch)) { // 문자열 두번째 단어가 소문자인지 확인
                res.append(Character.toUpperCase(ch)); // 소문자라면 대문자로 변경
            } else {
                res.append(ch); // 아닌경우 그냥 덮어쓰기
            }
        }
        System.out.println(res);
    }
}

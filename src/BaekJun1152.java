import java.util.Scanner;

public class BaekJun1152 {

    // 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();


        if (word.length() > 1000000){
            return;
        }
        if (word.isEmpty()){
            System.out.println(0);
            return;
        }
        String[] line = word.split(" ");

//      System.out.println(Arrays.toString(line));  // Arrays.tostring으로 배열 전체를 확인함

        System.out.println(line.length);

        sc.close();
    }
}

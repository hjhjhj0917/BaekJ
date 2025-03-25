import java.util.Scanner;

public class BaekJun11382 {

    //꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();  // 정수 데이터 타입인 long을 사용하여 데이터 범위를 늘림
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a + b + c);
    }
}

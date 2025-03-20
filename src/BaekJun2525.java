import java.util.Scanner;

public class BaekJun2525 {

    // 시작하는 현재 시각과 원하는 시간(분단위)를 입력하면 그 시간을 더한 값을 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (b + c >= 60 && (b + c) / 60 + a < 24){

            System.out.printf("%d %d", a + ((b + c) / 60), (b + c) - 60*((b + c)/60));

        }else if (b + c >= 60 && (b + c) / 60 + a == 24){

            System.out.printf("%d %d", 0, (b + c) - 60*((b + c)/60));

        }else if(b + c >= 60 && (b + c) / 60 + a > 24){

            System.out.printf("%d %d", a + ((b + c) / 60) - 24, (b + c) - 60*((b + c)/60));

        }else if(b + c < 60){

            System.out.printf("%d %d", a, b + c);
        }
        sc.close();
    }
}

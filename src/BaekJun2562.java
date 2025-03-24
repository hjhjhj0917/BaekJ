import java.util.Scanner;

public class BaekJun2562 {

//     9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int count = 9;
        int max = 0;
        int num1 = 0;

        for(int i = 0; i < count; i++) {

            int num = sc.nextInt();
            int[] arr = new int[count];  // int[] int형태의 배열을 선언한다는 뜻이고, int[count] []안에 count는 배열의 길이를 나타낸다.

            arr[i] = num;

            if(num <= 0 || num >=100) {  // 범위를 100보다 작은 자
                 return;
            }
            if(arr[i] >= max){
                 max = arr[i];
                 num1 = i + 1;
            }

        }
        System.out.println(max);
        System.out.println(num1);

    }

}

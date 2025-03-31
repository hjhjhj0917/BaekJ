import java.util.Scanner;

public class BaekJun25304 {

    // 영수증 값이 제대로 된건지 확인하는 프로그램을 작성하시오.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();
        int su = sc.nextInt();
        int[] all1 = new int[su];
        int gap = 0;
        sc.nextLine();

        for (int i = 0; i < su; i++) {

            String price = sc.nextLine().trim();
            String[] hap1 = price.split(" ");

            int price1 = Integer.parseInt(hap1[0]);
            int su1 = Integer.parseInt(hap1[1]);

            all1[i] = price1 * su1;
        }
        for (int i = 0; i < su; i++) {
            gap = gap + all1[i];
        }
        if (gap == all){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        sc.close();
    }
}

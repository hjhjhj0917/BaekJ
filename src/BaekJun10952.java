import java.util.ArrayList;
import java.util.Scanner;

public class BaekJun10952 {

    // 정수 A 하고 B를 입력받아서 두 수의 합을 출력하는 프로그래을 만드시오 (단, 0 0을 입력하면 종료 되도록 하시오.)

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while(sc.hasNextLine()) {

            String num = sc.nextLine().trim();
            String[] hap = num.split(" ");

            int hap1 = Integer.parseInt(hap[0]);
            int hap2 = Integer.parseInt(hap[1]);

            if (hap1 == 0 && hap2 ==0){
                break;
            }

            list.add(hap1 + hap2);
        }
        for (int su : list){
            System.out.println(su);
        }
        sc.close();
    }
}

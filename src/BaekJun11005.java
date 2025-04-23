import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJun11005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int form = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {
            if (num > form) {
                list.add(num % form);
                num /= form;
            } else {
                list.add(num);
                break;
            }
        }
        Collections.reverse(list); // list를 역순으로 바꿔주는 함수

        for (Integer integer : list) {
            System.out.print(Integer.toString(integer, form).toUpperCase());
        }
        sc.close();
    }
}

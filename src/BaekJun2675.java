import java.util.ArrayList;
import java.util.Scanner;

public class BaekJun2675 {

    // 문자열의 개수를 입력하고, 반복할 수와 반복할 문자열을 입력한 다음 문자열의 문자 하나하나를 반복하여 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int su = 0;
        sc.nextLine();

        ArrayList<String> result = new ArrayList<>();
        String m = "";

        for (int i = 0; i < n; i++){

            String str = sc.nextLine();
            String[] line = str.split(" ");
            su = Integer.parseInt(line[0]);

            for (int j = 0; j < line[1].length(); j++) {
                m += str.substring(j + 2, j + 3).repeat(su);
            }
            result.add(m);
            m = "";
        }
        for (int i = 0; i < result.toArray().length; i++){
                System.out.println(result.get(i));
        }
        sc.close();
    }
}

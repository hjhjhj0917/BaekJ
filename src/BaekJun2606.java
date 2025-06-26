import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaekJun2606 {

    // 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int com = sc.nextInt();
        int num = sc.nextInt();
        Set<Integer> res = new HashSet<>();
        res.add(1);

        sc.nextLine();

        for (int i = 0; i < num; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if (res.contains(n1) || res.contains(n2)) {
                res.add(n1);
                res.add(n2);
            }
        }
        System.out.println(res.size()-1);
        sc.close();
    }
}

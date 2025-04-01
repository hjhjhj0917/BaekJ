import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaekJun2606 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int com = sc.nextInt();
        int num = sc.nextInt();
        Set<Integer> res = new HashSet<>();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            String line = sc.nextLine();
            String[] str = line.split(" ");

            int su1 = Integer.parseInt(str[0]);
            int su2 = Integer.parseInt(str[1]);

            if (su1 == 1) {
                res.add(su2);
            }
            if (su2 == 1) {
                res.add(su1);
            }
        }
        System.out.println(res);
    }
}

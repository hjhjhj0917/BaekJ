import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJun2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) divisors.add(i);
        }

        if (divisors.size() < k) {
            System.out.println(0);
        } else {
            System.out.println(divisors.get(k-1));
        }
    }
}

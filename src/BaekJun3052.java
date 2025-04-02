import java.util.*;

public class BaekJun3052 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> res = new HashSet<>();

        for (int i = 0; i < 10; i++){
            int num = sc.nextInt();
            res.add(num % 42);
        }
        System.out.println(res.size());
        sc.close();
    }
}

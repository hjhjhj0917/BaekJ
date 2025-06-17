import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            a.add(i);
        }

        for (int result : a) { // 2세대
            System.out.println(result);
        }

        a.forEach(result -> System.out.println(result)); // 3세대
    }
}

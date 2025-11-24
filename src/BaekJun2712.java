import java.util.Map;
import java.util.Scanner;

public class BaekJun2712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Map<String, Double> switches = Map.of(
                "kg", 2.2046,
                "lb", 0.4536,
                "l", 0.2642,
                "g", 3.7854
        );

        Map<String, String> units = Map.of(
                "kg", "lb",
                "lb", "kg",
                "l", "g",
                "g", "l"
        );

        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {

            double num = sc.nextDouble();
            String unit = sc.next();
            double res = num * switches.get(unit);

            sb.append(String.format("%.4f %s\n", res, units.get(unit)));
        }

        System.out.println(sb);
    }
}

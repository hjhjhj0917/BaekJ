import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaekJun1157 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().trim().toUpperCase();
        String[] str = line.split("");
        Map<String, Integer> map = new HashMap<>();

        int max = 0;
        int count = 0;
        String res = "";

        for (String s : str) {
            map.put(s, map.getOrDefault(s, 0) + 1);

            if (max < map.get(s)) {
                max = map.get(s);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            if (max == value) {
                res = key;
                count++;
            }
        }
        if (count > 1) {
            System.out.println("?");
        } else {
            System.out.println(res);
        }
        sc.close();
    }
}

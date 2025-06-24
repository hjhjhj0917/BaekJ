import java.util.List;
import java.util.Scanner;

public class BaekJun11367 {

    static class HobbitResult {
        int startNum, endNum;
        String rate;

        HobbitResult(int startNum, int endNum, String rate) {
            this.startNum = startNum;
            this.endNum = endNum;
            this.rate = rate;
        }

        boolean check(int score) {
            return score >= startNum && score <= endNum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<HobbitResult> hobbits = List.of(
            new HobbitResult(97, 100, "A+"),
            new HobbitResult(90, 96, "A"),
            new HobbitResult(87, 89, "B+"),
            new HobbitResult(80, 86, "B"),
            new HobbitResult(77, 79, "C+"),
            new HobbitResult(70, 76, "C"),
            new HobbitResult(67, 69, "D+"),
            new HobbitResult(60, 66, "D"),
            new HobbitResult(0, 59, "F")
        );
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            String rate = "";

            for (HobbitResult h : hobbits) {

                if(h.check(score)) {
                    rate = h.rate;
                    break;
                }
            }

            sb.append(name + " " + rate + "\n");
        }

        System.out.println(sb.toString());
    }
}

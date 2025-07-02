import java.util.Scanner;

public class BaekJun4562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            int brain = sc.nextInt();
            int needs = sc.nextInt();

            if (brain < needs) {

                result.append("NO BRAINS" + "\n");
            } else {

                result.append("MMM BRAINS" + "\n");
            }
        }

        System.out.println(result);
        sc.close();
    }
}

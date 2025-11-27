import java.util.Scanner;

public class BaekJun18411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {

            int achievement = sc.nextInt();

            if (min > achievement) min = achievement;

            result += achievement;
        }

        System.out.println(result -  min);
    }
}

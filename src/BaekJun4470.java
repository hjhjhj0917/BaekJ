import java.util.Scanner;

public class BaekJun4470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {

            String line = sc.nextLine();
            result.append(i+1 + ". " + line + "\n");
        }

        System.out.println(result);
        sc.close();
    }
}

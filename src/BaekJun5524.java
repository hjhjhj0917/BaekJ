import java.util.Scanner;

public class BaekJun5524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {

            String line = sc.nextLine().toLowerCase();
            sb.append(line + "\n");
        }

        System.out.println(sb);
    }
}

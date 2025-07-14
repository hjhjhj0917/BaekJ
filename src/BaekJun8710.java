import java.util.Scanner;

public class BaekJun8710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentHeight = sc.nextInt();
        int goalHeight = sc.nextInt();
        int growHeight = sc.nextInt();

        int diff = goalHeight - currentHeight;

        if (diff % growHeight != 0) {
            System.out.println(diff / growHeight + 1);
        } else {
            System.out.println(diff / growHeight);
        }
    }
}

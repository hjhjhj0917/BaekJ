import java.util.Scanner;

public class BaekJun14581 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();

        System.out.printf(":fan::fan::fan:\n" +
                ":fan::%s::fan:\n" +
                ":fan::fan::fan:", id);
    }
}

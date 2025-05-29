import java.util.Scanner;

public class BaekJun28352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long second = sc.nextLong();
        long allSecond = 1;

        for (int i = 2; i <= second; i++) {
            allSecond *= i;
        }
        long result = allSecond / 604800;
        System.out.println(result);
    }
}

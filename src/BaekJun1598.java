import java.util.Scanner;

public class BaekJun1598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        long southNorth = Math.abs((num1 - 1) % 4 - (num2 - 1) % 4);
        long eastWest = Math.abs((num1 - 1) / 4 - (num2 - 1) / 4);

        System.out.println(southNorth + eastWest);
    }
}

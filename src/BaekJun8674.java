import java.util.Scanner;

public class BaekJun8674 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long row = sc.nextLong();
        long col = sc.nextLong();

        if ((row < 1 || row > Math.pow(2, 32)) || (col < 1 || col > Math.pow(2, 32))) return;

        long result1 = ((row / 2 + row % 2) * col) - ((row / 2) * col);
        long result2 = ((col / 2 + col % 2) * row) - ((col / 2) * row);

        System.out.println(Math.min(result1, result2));
    }
}

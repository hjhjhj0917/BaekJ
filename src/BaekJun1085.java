import java.util.Scanner;

public class BaekJun1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int xPos = sc.nextInt();
        int yPos = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();

        int xResult = Math.min(xPos, width - xPos);
        int yResult = Math.min(yPos, height - yPos);

        System.out.println(Math.min(xResult, yResult));
    }
}

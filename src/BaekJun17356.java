import java.util.Scanner;

public class BaekJun17356 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ukNum = sc.nextInt();
        int jeNum = sc.nextInt();
        double mNum = (double)(jeNum - ukNum) / 400;

        double result = 1 / (1 + Math.pow(10, mNum));
        System.out.println(result);
    }
}

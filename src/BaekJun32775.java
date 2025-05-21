import java.util.Scanner;

public class BaekJun32775 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int subTime = sc.nextInt();
        int fliTime = sc.nextInt();

        if (subTime <= fliTime) {
            System.out.println("high speed rail");
        } else {
            System.out.println("flight");
        }
    }
}

import java.util.Scanner;

public class BaekJun6887 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int length = sc.nextInt();

        for (int i = 1; i*i <= length; i++) {

                result = i;
        }

        System.out.println("The largest square has side length " + result + ".");
    }
}

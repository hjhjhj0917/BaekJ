import java.util.Scanner;

public class BaekJun20673 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int confirmedNum = sc.nextInt();
        int hospitalizedNum = sc.nextInt();

        if (confirmedNum <= 50 && hospitalizedNum <= 10) {
            System.out.println("White");
        } else if (hospitalizedNum > 30) {
            System.out.println("Red");
        } else {
            System.out.println("Yellow");
        }
    }
}

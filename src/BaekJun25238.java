import java.util.Scanner;

public class BaekJun25238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int defendRate = sc.nextInt();
        int igDefendRate = sc.nextInt();

        int result = (int)(defendRate - (defendRate * (igDefendRate*0.01)));
        if (result >= 100) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}

import java.util.Scanner;

public class BaekJun14924 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int trainSpeed  = sc.nextInt();
        int flySpeed  = sc.nextInt();
        int trainDistance = sc.nextInt();

        int trainMeet = trainDistance / (trainSpeed * 2);
        int result = trainMeet * flySpeed;
        System.out.println(result);
    }
}

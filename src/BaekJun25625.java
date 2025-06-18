import java.util.Scanner;

public class BaekJun25625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int driveTime = sc.nextInt();
        int arriveTime = sc.nextInt();

        if (driveTime > arriveTime) {
            System.out.println(driveTime + arriveTime);
        } else if (driveTime == arriveTime) {
            System.out.println(0);
        } else {
            System.out.println(arriveTime % driveTime);
        }
    }
}

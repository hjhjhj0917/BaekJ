import java.util.Scanner;

public class BaekJun19698 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cowNum = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int location = sc.nextInt();

        int allowNum = (width / location) * (height / location);

        if (allowNum >= cowNum) {
            System.out.println(cowNum);
        } else {
            System.out.println(allowNum);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class BaekJun16199 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int birthYear = sc.nextInt();
        int birthMonth = sc.nextInt();
        int birthDay = sc.nextInt();

        int currentYear = sc.nextInt();
        int currentMonth = sc.nextInt();
        int currentDay = sc.nextInt();

        if (birthYear == currentYear) {
            System.out.println(0);
        } else {
            if (birthMonth == currentMonth) {
                if (birthDay <= currentDay) {
                    System.out.println(currentYear - birthYear);
                } else {
                    System.out.println(currentYear - birthYear - 1);
                }
            } else if (birthMonth < currentMonth) {
                System.out.println(currentYear - birthYear);
            } else {
                System.out.println(currentYear - birthYear - 1);
            }
        }
        System.out.println(currentYear - birthYear + 1);
        System.out.println(currentYear - birthYear);
    }
}

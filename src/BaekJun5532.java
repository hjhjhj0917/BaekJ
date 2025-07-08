import java.util.Scanner;

public class BaekJun5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDay = sc.nextInt();
        int korea = sc.nextInt();
        int math = sc.nextInt();
        int koreaPage = sc.nextInt();
        int mathPage = sc.nextInt();
        int result = 0;

        int koreaDay = korea / koreaPage;
        if (korea % koreaPage != 0) koreaDay++;

        int mathDay = math / mathPage;
        if (math % mathPage != 0) mathDay++;

        if (koreaDay >= mathDay) {

            result = totalDay - koreaDay;
        } else {

            result = totalDay - mathDay;
        }

        System.out.println(result);
    }
}

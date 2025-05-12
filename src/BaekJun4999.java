import java.util.Scanner;

public class BaekJun4999 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String patient = sc.nextLine().replace("h", "a");
        String doctor = sc.nextLine().replace("h", "a");

        if (patient.length() >= doctor.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}

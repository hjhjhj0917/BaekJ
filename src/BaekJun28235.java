import java.util.Scanner;

public class BaekJun28235 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String slogan  = sc.nextLine();

        if (slogan.equals("SONGDO")) {
            System.out.println("HIGHSCHOOL");
        } else if (slogan.equals("CODE")) {
            System.out.println("MASTER");
        } else if (slogan.equals("2023")) {
            System.out.println("0611");
        } else if (slogan.equals("ALGORITHM")) {
            System.out.println("CONTEST");
        }
        sc.close();
    }
}

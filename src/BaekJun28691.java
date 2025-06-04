import java.util.Scanner;

public class BaekJun28691 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String init = sc.nextLine();

        if (init.equals("M")) {
            System.out.println("MatKor");
        } else if (init.equals("W")) {
            System.out.println("WiCys");
        } else if (init.equals("C")) {
            System.out.println("CyKor");
        } else if (init.equals("A")) {
            System.out.println("AlKor");
        } else if (init.equals("$")) {
            System.out.println("$clear");
        }
        sc.close();
    }
}

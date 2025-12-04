import java.util.Scanner;

public class BaekJun20499 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] kda = line.split("/");

        int kill = Integer.parseInt(kda[0]);
        int death = Integer.parseInt(kda[1]);
        int assist = Integer.parseInt(kda[2]);

        if (kill + assist < death || death == 0) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}

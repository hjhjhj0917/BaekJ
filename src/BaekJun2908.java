import java.util.Scanner;

public class BaekJun2908 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().replaceAll(" ","");
        String[] str = line.split("");

        String n1 = str[2] + str[1] + str[0];
        String n2 = str[5] + str[4] + str[3];

        int ns1 = Integer.parseInt(n1);
        int ns2 = Integer.parseInt(n2);

        if (ns1 > ns2) {
            System.out.println(n1);
        } else if (ns1 < ns2) {
            System.out.println(n2);
        }
        sc.close();
    }
}

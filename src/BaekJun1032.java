import java.util.Scanner;

public class BaekJun1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        String cmp = sc.nextLine();

        for (int i = 0; i < num - 1; i++) {

            String res = "";
            String fileName = sc.nextLine();

            for (int j = 0; j < fileName.length(); j++) {

                if (fileName.charAt(j) == cmp.charAt(j)) {
                    res += fileName.charAt(j);
                } else {
                    res += '?';
                }
            }

            cmp = res;
        }

        System.out.println(cmp);
    }
}

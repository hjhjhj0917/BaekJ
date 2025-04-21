import java.util.Scanner;

public class BaekJun2745 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int num = sc.nextInt();
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            int ascii = Integer.parseInt(String.valueOf(str.charAt(i)), num);
            res += (int) (ascii * Math.pow(num, str.length()-(1 + i)));
        }
        System.out.println(res);
        sc.close();
    }
}

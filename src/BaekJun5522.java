import java.util.Scanner;

public class BaekJun5522 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hap = 0;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            hap += num;
        }
        System.out.println(hap);
    }
}

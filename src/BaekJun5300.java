import java.util.Scanner;

public class BaekJun5300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if ((i+1) % 6 == 0 && i+1 != num) {

                result.append(i+1 + " Go! ");
            } else if ((i+1) % 6 != 0 && i+1 != num){

                result.append(i+1 + " ");
            } else if (i+1 == num) {

                result.append(i+1 + " Go!");
            }
        }

        System.out.println(result);
    }
}

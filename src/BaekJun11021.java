import java.util.Scanner;

public class BaekJun11021 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] gap = new int[num];
        sc.nextLine();


        for (int i = 0; i < num; i++) {
            String su = sc.nextLine();
            String[] hap = su.split(" ");

            int su1 = Integer.parseInt(hap[0]);
            int su2 = Integer.parseInt(hap[1]);

            gap[i] = su1 + su2;
        }
        for (int i = 0; i < num; i++) {
            System.out.println("Case #" + (i+1) + ": " + gap[i]);
        }

    }
}

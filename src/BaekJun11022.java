import java.util.Scanner;

public class BaekJun11022 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int su = sc.nextInt();
        int[] hap = new int[su];
        int[] n = new int[su];
        int[] m = new int[su];
        sc.nextLine();

        for (int i = 0; i < su; i++){
            String str = sc.nextLine();
            String[] line = str.split(" ");

            n[i] = Integer.parseInt(line[0]);
            m[i] = Integer.parseInt(line[1]);
            hap[i] = n[i] + m[i];
        }
        for (int i = 0; i < su; i++){
            System.out.println("Case #" + (i + 1) + ": " + n[i] + " + " + m[i] + " = " + hap[i]);
        }
        sc.close();
    }
}

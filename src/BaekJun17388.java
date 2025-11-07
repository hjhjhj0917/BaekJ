import java.util.Scanner;

public class BaekJun17388 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] cont = new int[3];
        int min = Integer.MAX_VALUE;
        int minUniv = 0;
        int hap = 0;

        for (int i = 0; i < cont.length; i++) {
            int univCont = sc.nextInt();
            cont[i] = univCont;
            hap += univCont;
            if (univCont < min) {
                min = univCont;
                minUniv = i;
            }
        }
        if (hap >= 100) {
            System.out.println("OK");
        } else {
            if (minUniv == 0) {
                System.out.println("Soongsil");
            } else if (minUniv == 1) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}

import java.util.Scanner;

public class BaekJun10818 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int max = -1000000;
        int min = 1000000;

        sc.nextLine();

        String su = sc.nextLine();
        String[] su1 = su.split(" ");

        for (int i = 0; i < num; i++) {

            int su2 = Integer.parseInt(su1[i]);

            if (su2 >= max){
                max = su2;
            }
            if (su2 <= min){
                min = su2;
            }

        }
        System.out.println(min + " " + max);
    }
}

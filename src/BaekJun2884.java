import java.util.Scanner;

public class BaekJun2884 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b < 45 && a > 0){
            System.out.printf("%d %d", a - 1, 60 - (45 - b));
        }else if(b < 45 && a == 0){
            System.out.printf("23 %d", 60 - (45 - b));
        }
        else if(b >= 45){
            System.out.printf("%d %d", a, b - 45);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class BaekJun25314 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 4 || num > 1000){
            return;
        }
        for (int i = 0; i < num / 4; i++){

            System.out.print("long ");
        }
        System.out.println("int");
        sc.close();
    }
}

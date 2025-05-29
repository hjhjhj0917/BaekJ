import java.util.Scanner;

public class BaekJun32929 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "UOS";
        Long num = sc.nextLong();

        System.out.println(str.charAt((int) ((num-1) % str.length())));


    }
}

import java.util.Scanner;

public class BaekJun28290 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();

        switch (type) {
            case ";lkjfdsa" :
                System.out.println("reverse");
                break;
            case "asdfjkl;" :
                System.out.println("stairs");
                break;
            case "asdf;lkj" :
            case ";lkjasdf" :
                System.out.println("out-in");
                break;
            case "fdsajkl;" :
            case "jkl;fdsa" :
                System.out.println("in-out");
                break;
            default :
                System.out.println("molu");
                break;
        }
        sc.close();
    }
}

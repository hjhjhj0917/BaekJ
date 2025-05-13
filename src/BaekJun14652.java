import java.util.Scanner;

public class BaekJun14652 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int seat = sc.nextInt();

        int resRow = seat / col;
        int resColumn = seat % col;

        System.out.println(resRow + " " + resColumn);
    }
}

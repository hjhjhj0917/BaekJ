import java.util.Scanner;

public class BaekJun13136 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();
        int cctv = sc.nextInt();

        long resRow = 1;
        long resColumn = 1;

        if (row % cctv == 0) {
            resRow = row / cctv;
        } else {
            resRow = row / cctv + 1;
        }
        if (column % cctv == 0) {
            resColumn = column / cctv;
        } else {
            resColumn = column / cctv + 1;
        }
        System.out.println(resRow * resColumn);
    }
}

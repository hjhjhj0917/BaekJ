import java.util.List;
import java.util.Scanner;

public class BaekJun29725 {

    static class ChessPoint {
        char chess;
        int point;

        ChessPoint(char chess, int point) {
            this.chess = chess;
            this.point = point;
        };

        boolean check(char ches) {
            return this.chess == ches;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<ChessPoint> points = List.of(
                new ChessPoint('P', 1),
                new ChessPoint('p', 1),
                new ChessPoint('N', 3),
                new ChessPoint('n', 3),
                new ChessPoint('B', 3),
                new ChessPoint('b', 3),
                new ChessPoint('R', 5),
                new ChessPoint('r', 5),
                new ChessPoint('Q', 9),
                new ChessPoint('q', 9)
        );
        int white = 0;
        int black = 0;

        for (int i = 0; i < 8; i++) {
            String line = sc.next();

            for (char c : line.toCharArray()) {

                for (ChessPoint po : points) {

                    if (po.check(c)) {

                        if(Character.isUpperCase(c)) {
                            white += po.point;
                        } else {
                            black += po.point;
                        }

                        break;
                    }
                }
            }
        }
        System.out.println(white - black);
    }
}

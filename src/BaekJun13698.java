import java.util.List;
import java.util.Scanner;

public class BaekJun13698 {

    static class Position {
        char method;
        int pos1, pos2;

        Position(char method, int pos1, int pos2) {
            this.method = method;
            this.pos1 = pos1;
            this.pos2 = pos2;
        }

        boolean check(char shuffleMethod) {
            return method == shuffleMethod;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Position> positions = List.of(
                new Position('A', 0, 1),
                new Position('B', 0, 2),
                new Position('C', 0, 3),
                new Position('D', 1, 2),
                new Position('E', 1, 3),
                new Position('F', 2, 3)
        );
        int[] position = {1, 0, 0, 2};
        int medium;
        int miniBall = 0;
        int bigBall = 0;
        String shuffleMethods = sc.nextLine();

        for (int i = 0; i < shuffleMethods.length(); i++) {
            char shuffleMethod = shuffleMethods.charAt(i);

            for (Position pos : positions) {
                medium = 0;

                if (pos.check(shuffleMethod)) {
                    medium = position[pos.pos1];
                    position[pos.pos1] = position[pos.pos2];
                    position[pos.pos2] = medium;
                    break;
                }
            }
        }

        for (int i = 0; i < position.length; i++) {

            if (position[i] == 1) {
                miniBall = i+1;
            } else if (position[i] == 2) {
                bigBall = i+1;
            }
        }

        System.out.println(miniBall + "\n" + bigBall);
    }
}

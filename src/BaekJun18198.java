import java.util.Scanner;

public class BaekJun18198 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String record = sc.nextLine();
        int Ascore = 0;
        int Bscore = 0;

        for (int i = 0; i < record.length()-1; i++) {

            if (record.charAt(i) == 'A') {
                Ascore += Integer.parseInt(String.valueOf(record.charAt(i+1)));
            } else if (record.charAt(i) == 'B') {
                Bscore += Integer.parseInt(String.valueOf(record.charAt(i+1)));
            }
        }

        if (Ascore > Bscore && Ascore - Bscore >= 2) {
            System.out.println("A");
        } else if (Bscore > Ascore && Bscore - Ascore >= 2) {
            System.out.println("B");
        }

    }
}

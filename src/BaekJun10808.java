import java.util.Scanner;

public class BaekJun10808 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String word = sc.nextLine();
        int[] result = new int[26];

        for (int i = 0; i < word.length(); i++) {
            result[alphabet.indexOf(word.charAt(i))]++;
        }
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}

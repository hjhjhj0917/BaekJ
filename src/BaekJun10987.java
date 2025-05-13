import java.util.Scanner;

public class BaekJun10987 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String vowel = "aeiou";
        int result = 0;
        String word = sc.nextLine().toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (vowel.contains(String.valueOf(word.charAt(i)))) {
                result++;
            }
        }
        System.out.println(result);
    }
}

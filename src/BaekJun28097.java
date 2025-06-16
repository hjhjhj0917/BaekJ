import java.util.Scanner;

public class BaekJun28097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjectNum = sc.nextInt();
        int result = 0;

        for (int i = 0; i < subjectNum; i++) {
            int studyTime = sc.nextInt();

            result += studyTime;
        }
        result += 8 * (subjectNum - 1);
        System.out.println(result/24 + " " + result%24);
    }
}

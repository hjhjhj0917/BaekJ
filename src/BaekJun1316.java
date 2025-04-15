import java.util.Scanner;

public class BaekJun1316 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        sc.nextLine();

        for (int i = 0; i < num; i++) {

            String line = sc.nextLine();
            String[] str = line.split("");

            for (int j = 0; j < str.length; j++) {
                if (str.length == j+1){
                    continue;
                }
                if (str[j].equals(str[j + 1])) {
                    line = line.replaceFirst(str[j], "");
                } else {
                    line = line.replaceFirst(str[j], "");
                    if (line.contains(str[j])) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(num - count);
        sc.close();
    }
}

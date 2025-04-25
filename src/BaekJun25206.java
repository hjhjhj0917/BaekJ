import java.util.Scanner;

public class BaekJun25206 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double res = 0;
        double hap = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()){
                break;
            }
            String[] str = line.split(" ");
            Double score = Double.parseDouble(str[1]);

            if (str[2].equals("P")) {
                continue;
            } else if (str[2].equals("A+")) {
                res += (double) score * 4.5;
            } else if (str[2].equals("A0")) {
                res += (double) score * 4.0;
            } else if (str[2].equals("B+")) {
                res += (double) score * 3.5;
            } else if (str[2].equals("B0")) {
                res += (double) score * 3.0;
            } else if (str[2].equals("C+")) {
                res += (double) score * 2.5;
            } else if (str[2].equals("C0")) {
                res += (double) score * 2.0;
            } else if (str[2].equals("D+")) {
                res += (double) score * 1.5;
            } else if (str[2].equals("D0")) {
                res += (double) score * 1.0;
            } else if (str[2].equals("F")) {
                res += (double) score * 0;
            }
            hap += score;
        }
        System.out.printf("%.6f", res / hap);
        sc.close();
    }
}

import java.util.Scanner;

public class BaekJun5662 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String alp = "abcdefghijklmnopqrstuvwxyz";
        String[] alpStr = alp.split("");

        String line = sc.nextLine().toLowerCase();
        String[] str = line.split("");
        int[] res = new int[str.length];
        int hap = 0;

        for (int i = 0; i < alpStr.length; i++) {

            for (int j = 0; j < str.length; j++) {
                int a;
                if (alpStr[i].equals(str[j])) {
                    a = i;
                } else {
                    continue;
                }
                if (a < 3){
                    res[j] = 3;
                } else if (a < 6){
                    res[j] = 4;
                } else if (a < 9){
                    res[j] = 5;
                } else if (a < 12){
                    res[j] = 6;
                } else if (a < 15){
                    res[j] = 7;
                } else if (a < 19){
                    res[j] = 8;
                } else if (a < 22){
                    res[j] = 9;
                } else if (a < 26){
                    res[j] = 10;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            hap += res[i];
        }
        System.out.println(hap);
        sc.close();
    }
}

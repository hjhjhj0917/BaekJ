import java.util.Scanner;

public class BaekJun2941 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().toLowerCase().trim();
        int count = 0;

        while (true) {
            if (line.contains("dz=")) {
                line = line.replaceFirst("dz=", " ");
            }else if (line.contains("c=")) {
                line = line.replaceFirst("c=", " ");
            }else if (line.contains("c-")) {
                line = line.replaceFirst("c-", " ");
            }else if (line.contains("d-")) {
                line = line.replaceFirst("d-", " ");
            }else if (line.contains("lj")) {
                line = line.replaceFirst("lj", " ");
            }else if (line.contains("nj")) {
                line = line.replaceFirst("nj", " ");
            }else if (line.contains("s=")) {
                line = line.replaceFirst("s=", " ");
            }else if (line.contains("z=")) {
                line = line.replaceFirst("z=", " ");
            }else {
                break;
            }
            count++;
        }
        line = line.replaceAll(" ", "");
        System.out.println(line.length() + count);
    }
}

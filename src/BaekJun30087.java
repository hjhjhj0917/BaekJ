import java.util.ArrayList;
import java.util.Scanner;

public class BaekJun30087 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            String line = sc.nextLine();

            if (line.equals("Algorithm")) {
                list.add("204");
            } else if (line.equals("DataAnalysis")) {
                list.add("207");
            } else if (line.equals("ArtificialIntelligence")) {
                list.add("302");
            } else if (line.equals("CyberSecurity")) {
                list.add("B101");
            } else if (line.equals("Network")) {
                list.add("303");
            } else if (line.equals("Startup")) {
                list.add("501");
            } else if (line.equals("TestStrategy")) {
                list.add("105");
            }
        }
        for (String res : list) {
            System.out.println(res);
        }

    }
}

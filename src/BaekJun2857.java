import java.io.*;

public class BaekJun2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        boolean exist = false;

        for (int i = 0; i < 5; i++) {

            String name = br.readLine();

            if (name.contains("FBI")) {
                sb.append(i + 1 + " ");
                exist = true;
            }
        }

        if (exist) {
            bw.write(sb + "");
        } else {
            bw.write("HE GOT AWAY!");
        }

        bw.flush();
        bw.close();
    }
}

import java.io.*;

public class BaekJun24087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int targetHeight = Integer.parseInt(br.readLine());
        int standHeight = Integer.parseInt(br.readLine());
        int increaseHeight = Integer.parseInt(br.readLine());

        int count = 0;
        int increase = increaseHeight;

        while (true) {

            if (standHeight >= targetHeight) break;

            count++;

            if (standHeight + increaseHeight >= targetHeight) break;

            increaseHeight += increase;
        }

        bw.write((count * 100) + 250 + "\n");

        bw.flush();
    }
}

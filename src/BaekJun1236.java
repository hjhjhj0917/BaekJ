import java.io.*;
import java.util.StringTokenizer;

public class BaekJun1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int countF = 0;
        int countP = 0;

        String[] floors = new String[row];
        String[] parts = new String[col];

        for (int i = 0; i < row; i++) {

            floors[i] = br.readLine();

            if (!floors[i].contains("X")) {
                countF++;
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {

                parts[i] += floors[j].charAt(i) + "";
            }

            if (!parts[i].contains("X")) {
                countP++;
            }
        }

        bw.write(Math.max(countF, countP) + "");
        bw.flush();
        bw.close();
    }
}

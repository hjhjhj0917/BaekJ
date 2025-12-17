import java.io.*;
import java.util.StringTokenizer;

public class BaekJun24183 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double paperC4 = 0.148392;
        double paperA3 = 0.24948;
        double paperA4 = 0.06237;

        int envelope = Integer.parseInt(st.nextToken());
        int poster = Integer.parseInt(st.nextToken());
        int notice = Integer.parseInt(st.nextToken());

        double resC4 = paperC4 * envelope;
        double resA3 = paperA3 * poster;
        double resA4 = paperA4 * notice;

        bw.write(String.format("%.6f\n", resC4 + resA3 + resA4));

        bw.flush();
    }
}

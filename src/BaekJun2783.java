import java.io.*;
import java.util.StringTokenizer;

public class BaekJun2783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cmpPrice = Integer.parseInt(st.nextToken());
        int cmpGram = Integer.parseInt(st.nextToken());

        double cmpResult = ((double) cmpPrice / cmpGram) * 1000;

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {

            st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int gram = Integer.parseInt(st.nextToken());
            double result = ((double) price / gram) * 1000;

            cmpResult = Math.min(result, cmpResult);
        }

        bw.write(String.format("%.2f", cmpResult) + "\n");
        bw.flush();
        bw.close();
    }
}

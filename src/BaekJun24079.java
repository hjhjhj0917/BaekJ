import java.io.*;

public class BaekJun24079 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int time1 = Integer.parseInt(br.readLine());
        int time2 = Integer.parseInt(br.readLine());
        int arriveTime = Integer.parseInt(br.readLine());

        if (time1 + time2 > arriveTime + 0.5) {
            bw.write("0\n");
        } else {
            bw.write("1\n");
        }

        bw.flush();
    }
}

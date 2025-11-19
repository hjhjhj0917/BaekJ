import java.io.*;
import java.util.StringTokenizer;

public class BaekJun1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[5];
        int n = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            n = Math.min(n, num[i]);
        }

        while(true) {

            int count = 0;

            for(int i = 0; i < 5; i++) {

                if (n % num[i] == 0) count++;
                if (count == 3) break;
            }

            if (count == 3) break;

            n++;
        }

        bw.write(n + "");
        bw.flush();
        bw.close();
        br.close();
    }
}

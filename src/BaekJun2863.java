import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;

public class BaekJun2863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[4];
        double max = -1;
        Map<Integer, Double> results = new HashMap<>();

        for (int i = 0; i < 2; i++) {

            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            arr[i * 2] = Integer.parseInt(st.nextToken());
            arr[i * 2 + 1] = Integer.parseInt(st.nextToken());
        }

        results.put(0, (double)arr[0] / arr[2] + (double)arr[1] / arr[3]);

        for (int i = 0; i < 4; i++) {

            int space = arr[2];

            arr[2] = arr[3];
            arr[3] = arr[1];
            arr[1] = arr[0];
            arr[0] = space;

            double result = (double) arr[0]/arr[2] + (double) arr[1]/arr[3];

            results.put(i + 1, result);

            if (max <= result) max = result;
        }

        for (int i = 0; i < 5; i++) {

            if (Objects.equals(results.get(i), max)) {
                bw.write(i + "");
                break;
            }
        }

        bw.flush();
        bw.close();
    }
}

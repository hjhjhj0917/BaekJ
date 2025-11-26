import java.io.*;
import java.util.StringTokenizer;

public class BaekJun2765 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int count = 0;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double diameter = Double.parseDouble(st.nextToken());
            int revolution = Integer.parseInt(st.nextToken());
            double time = Double.parseDouble(st.nextToken());

            count++;

            if (revolution == 0) break;

            double totalDistance = (Math.PI * diameter * revolution) / 63360;
            double avgSpeed = totalDistance / (time / 3600);

            sb.append("Trip #" + count + ": " + String.format("%.2f", totalDistance) + " " + String.format("%.2f", avgSpeed) + "\n");
        }

        bw.write(sb + "\n");
        bw.flush();
        bw.close();
    }
}

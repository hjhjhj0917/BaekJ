import java.io.*;

public class BaekJun24083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int currentHour = Integer.parseInt(br.readLine());
        int laterHour = Integer.parseInt(br.readLine());

        if ((currentHour + laterHour) % 12 == 0) {
            bw.write(12 + "\n");
        } else {
            bw.write((currentHour + laterHour) % 12 + "\n");
        }

        bw.flush();
    }
}

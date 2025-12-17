import java.io.*;

public class BaekJun24084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String s = br.readLine();

        for (int i = 1; i < num; i++)
            if (s.charAt(i) == 'J') sb.append(s.charAt(i - 1) + "\n");

        bw.write(sb + "\n");

        bw.flush();
    }
}

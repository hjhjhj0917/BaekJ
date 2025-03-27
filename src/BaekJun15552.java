import java.io.*;  // Java의 입출력(Input/Output, IO) 기능을 제공하는 패키지(java.io)의 모든 클래스를 포함하는 구문이다.

public class BaekJun15552 {

    // Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
    // BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

    // 첫 줄에 테스트 개수가 주어지고, 각 줄에 입력한 수를 합한 값을 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // System.in은 사용자가 입력한 값을 byte단위로 읽어 들이는데
                                                                                  // byte단위로 읽어들인 것을 문자 형태로 처리하기 위해서 InputStreamReader을 사용했다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// System.in은 사용자가 입력한 값을 byte단위로 읽어 들이는데
                                                               // byte단위로 읽어들인 것을 문자 형태로 처리하기 위해서 InputStreamReader을 사용했다.

        int num = Integer.parseInt(br.readLine());  // 버퍼를 사용하여 값을 받으면 값이 항상 String으로 고정되기 때문에 다른 데이터 형으로
                                                    // 사용하고 싶으면 변환을 시켜주어야 한다.
        for (int i = 0; i < num; i++) {

            String[] su = br.readLine().split(" ");

            int num1 = Integer.parseInt(su[0]);
            int num2 = Integer.parseInt(su[1]);
            int hap = num1 + num2;

            bw.write(hap + "\n");

        }

        bw.flush();

        br.close();
        bw.close();

    }
}

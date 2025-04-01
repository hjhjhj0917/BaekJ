import java.util.Scanner;

public class BaekJun9012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] result = new String[n];

        for (int i = 0; i < n; i++){
            String str = sc.nextLine().trim();

            while (str.contains("()")){  // contains를 통해서 괄호가 정상적으로 열고 닫힌것이 있는지 확인
                str = str.replaceAll("\\(\\)", ""); // 정상적으로 열고 닫은 괄호를 빈 문자로 계속 변경
            }
            if (str.isEmpty()){
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(result[i]);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class BakeJun15051 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] floors = new int[3];

            for (int i = 0; i < 3; i++) {
                floors[i] = sc.nextInt();
            }

            int minTime = Integer.MAX_VALUE;


            for (int machineFloor = 0; machineFloor < 3; machineFloor++) {
                int totalTime = 0;

                for (int i = 0; i < 3; i++) {
                    int distance = Math.abs(machineFloor - i);
                    totalTime += 2 * distance * floors[i]; // 왕복 거리
                }

                minTime = Math.min(minTime, totalTime);
            }

            System.out.println(minTime);
        }


}

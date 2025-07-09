import java.util.Scanner;

public class BaekJun6825 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 25) {
            System.out.println("Normal weight");
        } else {
            System.out.println("Overweight");
        }
    }
}

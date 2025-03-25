import java.util.Scanner;

public class BaekJun2480 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        String[] dice = num.split(" ");

        int num1 = Integer.parseInt(dice[0]);
        int num2 = Integer.parseInt(dice[1]);
        int num3 = Integer.parseInt(dice[2]);

        if (num1 == num2 && num2 == num3){

            System.out.println(10000 + num1 * 1000);

        } else if (num1 == num2 || num1 == num3){

            System.out.println(1000 + num1 * 100);

        }else if (num2 == num1 || num2 == num3){

            System.out.println(1000 + num2 * 100);

        }else if (num3 == num1 || num3 == num2){

            System.out.println(1000 + num2 * 100);

        }else if (num1 != num2 && num1 != num3 && num2 != num3){

            if(num1 > num2 && num1 > num3){

                System.out.println(num1 * 100);

            }else if (num2 > num1 && num2 > num3){

                System.out.println(num2 * 100);

            }else if (num3 > num1 && num3 > num2){

                System.out.println(num3 * 100);

            }
        }
    }
}

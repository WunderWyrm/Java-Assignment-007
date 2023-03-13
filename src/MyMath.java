/**
 *
 * @author Samuel Theiss
 * @author Trevor Hartman
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class MyMath {

    public static int gcf(int num1, int num2) {

        boolean running = true;
        int num3;

        while (running) {
            if (num2 == 0) {
                running = false;
            } else if (num1 > num2) {
                num3 = num2;
                num2 = num1 % num2;
                num1 = num3;
            } else {
                num2 = num2 % num1;
            }
        }

        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("GCF is: " + gcf(num1, num2));
    }
}

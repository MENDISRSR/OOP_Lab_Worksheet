package LW_01;

import java.util.Scanner;

public class Q_03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length in centimeters : ");
        int cm = scanner.nextInt();
        float inch = (float) (cm/2.54);
        int feet = (int) (inch/12);
        inch -= feet*12;

        System.out.printf("Entered length is : %d feet and %.2f inches",feet,inch);

    }
}
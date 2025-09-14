package LW_02;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int rows = scanner.nextInt();

        for (int i = rows; i>0; i--){
            for (int j = i; j >= 0; j--){
                System.out.print(" ");
            }
            for (int k = 0; k <= rows-i; k++){
                System.out.print("*");
            }
            for (int l = 0; l < rows-i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

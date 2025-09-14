package LW_02;

import java.util.Arrays;
import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[5];
        System.out.println("Enter 5 integers seperated by spaces : ");
        for (int i = 0; i < 5; i++){
            a[i] = scanner.nextInt();
        }
        int[] m = Arrays.stream(a).sorted().toArray();
        System.out.println(m[3]);

        scanner.close();
    }


}

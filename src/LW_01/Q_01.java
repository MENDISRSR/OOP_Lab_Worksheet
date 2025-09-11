package LW_01;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a odd-length word : ");
        String word = scanner.next();
        int length = word.length();
        System.out.println("Middle character og the word is : "+word.charAt(length/2));

    }
}
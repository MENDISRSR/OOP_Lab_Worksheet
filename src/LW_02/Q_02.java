package LW_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an integer number (negative to terminate) : ");
            int num = scanner.nextInt();

            int count = 0;
            if (num > 0) {
                while (num > 0) {
                    num = num / 10;
                    count++;
                }
                System.out.println("No of digits in the argument : " + count);
            }else if (num == 0){
                while (num == 0){
                    count++;
                    num = -1;;
                }
                System.out.println("No of digits in the argument : " + count);
            }
            else {
                System.out.println("You have entered negative number.Program terminated");
                break;
                }
            }
        }
    }


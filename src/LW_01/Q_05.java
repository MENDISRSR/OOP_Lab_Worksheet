package LW_01;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter outer circle radius value : ");
        double ro = scanner.nextDouble();
        System.out.println("Enter inner circle radius value : ");
        double ri = scanner.nextDouble();

        Circle outerCircle = new Circle(ro);
        Circle innerCircle = new Circle(ri);
        double outerCircleArea = outerCircle.computeArea();
        double innerCircleArea = innerCircle.computeArea();
        double shadedArea = outerCircleArea-innerCircleArea;

        System.out.println("Shaded area : "+shadedArea);

        double outerCircumference = outerCircle.computeCircumference();
        double innerCircumference = innerCircle.computeCircumference();
        double shadedCircumference = outerCircumference-innerCircumference;

        System.out.println("Shaded circumference : "+shadedCircumference);
    }
}

package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Please enter a radius of a circle: ");
        double radius = scanner.nextDouble();
        double area = Circle.getArea(radius);
        System.out.print("The area of a circle of radius  " + radius + " is " + area);
    }
}

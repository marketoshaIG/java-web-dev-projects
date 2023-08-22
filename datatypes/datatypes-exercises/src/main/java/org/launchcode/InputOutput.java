package org.launchcode;
import java.util.Scanner;

public class InputOutput {
        public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length of the rectangle
        System.out.println("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        // Prompt the user for the width of the rectangle
        System.out.println("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        // Calculate the area of the rectangle
        int area = length * width;

        // Print the area of the rectangle
        System.out.println("The area of the rectangle is " + area);
    }
}

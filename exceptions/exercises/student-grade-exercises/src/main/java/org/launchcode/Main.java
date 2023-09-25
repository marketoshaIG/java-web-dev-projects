package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        int x = 10;
        int y = 0;

        try {
            int result = Divide(x, y);
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String studentName : studentFiles.keySet()) {
            String fileName = studentFiles.get(studentName);

            try {
                int points = CheckFileExtension(fileName);
                System.out.println("Student " + studentName + " receives " + points + " point(s) for their file.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int Divide(int x, int y)
    {
        // Write code here!
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return x / y;
    }

    public static int CheckFileExtension(String fileName)
    {if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("File name cannot be null or empty!");
        }
        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}
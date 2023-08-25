package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("src/org/launchcode/SuperBonus.txt");
        Scanner scanner = new Scanner(text);

        HashMap<Character, Integer> charCount = new HashMap<>();
        String fileContent = "";

        try {
            while (scanner.hasNext()) {
                fileContent = fileContent.concat(scanner.nextLine() + "\n");
            }
        } finally {
            scanner.close();
        }

        fileContent = fileContent.replaceAll("[^A-Za-z0-9]", "");

        for (char c : fileContent.toLowerCase().toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (Character c : charCount.keySet()) {
            System.out.println(c + ": " + charCount.get(c));
        }
    }
}


//        for (int i = 0; i < str.length(); i++) {
//            char c = str.toLowerCase().charAt(i);
//            if (charCount.containsKey(c)) {
//                charCount.put(c, charCount.get(c) + 1);
//            } else {
//                charCount.put(c, 1);
//            }
//        }

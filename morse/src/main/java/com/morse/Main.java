package com.morse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String morsePhrase = "--.--.---.......-.---.-.-.-..-.....--..-....-.-----..-";
        String ruteDictionary = "C:/Users/mtirador/Desktop/Practicas/morse/src/main/java/com/morse/dictionary.txt";

        List<String> dictionary = loadDictionary(ruteDictionary);

        List<String> matches = new ArrayList<>();
        FindMatches.findMatches(morsePhrase, dictionary, "", matches);

        if (!matches.isEmpty()) {
            System.out.println("Matches found:");
            for (String match : matches) {
                System.out.println(match);
            }
        } else {
            System.out.println("No matches found.");
        }
    }

    private static List<String> loadDictionary(String filePath) {
        List<String> dictionary = new ArrayList<>();
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {
            String word;
            while ((word=br.readLine())!= null) {
                dictionary.add(word);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return dictionary;
    }
}

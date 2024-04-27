package com.morse;

import java.util.List;

public class FindMatches {
    
    public static void findMatches(String morsePhrase, List<String> dictionary, String currentTranslation, List<String> matches) {
        if (morsePhrase.isEmpty()) {
            matches.add(currentTranslation.trim());
            return;
        }
        
        MorseTranslator translator = new MorseTranslator();

        for (String word : dictionary) {
            String morseWord = translator.translateToMorse(word);
            if (morsePhrase.startsWith(morseWord)) {
                findMatches(morsePhrase.substring(morseWord.length()), dictionary, currentTranslation + word + " ", matches);
            }
        }
    }
}

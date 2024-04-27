package com.morse;

import java.util.HashMap;

public class MorseTranslator {

    private final HashMap<Character, String> mapCode;

    public MorseTranslator() {
        
        mapCode = new HashMap<>();
        mapCode.put('a', ".-");
        mapCode.put('b', "-...");
        mapCode.put('c', "-.-.");
        mapCode.put('d', "-..");
        mapCode.put('e', ".");
        mapCode.put('f', "..-.");
        mapCode.put('g', "--.");
        mapCode.put('h', "....");
        mapCode.put('i', "..");
        mapCode.put('j', ".---");
        mapCode.put('k', "-.-");
        mapCode.put('l', ".-..");
        mapCode.put('m', "--");
        mapCode.put('n', "-.");
        mapCode.put('o', "---");
        mapCode.put('p', ".--.");
        mapCode.put('q', "--.-");
        mapCode.put('r', ".-.");
        mapCode.put('s', "...");
        mapCode.put('t', "-");
        mapCode.put('u', "..-");
        mapCode.put('v', "...-");
        mapCode.put('w', ".--");
        mapCode.put('x', "-..-");
        mapCode.put('y', "-.--");
        mapCode.put('z', "--..");
    }

    public String translateToMorse(String phrase) {
        StringBuilder morseTranslation = new StringBuilder();
        for (char character : phrase.toLowerCase().toCharArray()) {
            if (Character.isLetter(character)) {
                morseTranslation.append(mapCode.get(character));
            } else if (character == ' ') {
                morseTranslation.append(" ");
            }
        }
        return morseTranslation.toString().trim();
    }
}

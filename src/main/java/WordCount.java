//package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String document = "I am doing software engineering";
        Map<String, Integer> wordFrequency = getWordFrequency(document);
        System.out.println("Word frequency:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> getWordFrequency(String document) {
        Map<String, Integer> frequency = new HashMap<>();
        String[] words = document.split("[\\s\\t\\n]+");
        for (String word : words) {
            if (!word.isEmpty()) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }
        return frequency;
    }
}

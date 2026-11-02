package collectionsTasks;

import java.util.HashMap;
import java.util.Map;



public class wordFrequency {
    public static void main(String[] args) {

        String sentence = "java is easy and java is powerful";

        String[] words = sentence.toLowerCase().split("\\s+");

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(
                    word,
                    frequency.getOrDefault(word, 0) + 1
            );
        }

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}

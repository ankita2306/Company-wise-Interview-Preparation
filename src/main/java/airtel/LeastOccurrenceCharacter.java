package airtel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LeastOccurrenceCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        char result = findLeastOccurringCharacter(str);
        if (result != '\0') {
            System.out.println("First character with the least occurrence: " + result);
        } else {
            System.out.println("No valid characters found.");
        }
    }

    private static char findLeastOccurringCharacter(String str) {
        if (str == null || str.isEmpty()) return '\0';

        // Step 1: Count occurrences of each character
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the minimum occurrence
        int minCount = Integer.MAX_VALUE;
        for (int count : charCountMap.values()) {
            minCount = Math.min(minCount, count);
        }

        // Step 3: Find the first character with the minimum occurrence
        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == minCount) {
                return ch;
            }
        }

        return '\0'; // Return null character if no valid result found
    }
}

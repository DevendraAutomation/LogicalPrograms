package Automation_Test_Practice;
import java.util.*;

public class DuplicateLetterCount {
    public static void main(String[] args) {
        String input = "Hello World";
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        for (char c : input.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
            }
        }
    }
}

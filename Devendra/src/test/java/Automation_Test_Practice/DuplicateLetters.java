package Automation_Test_Practice;
import java.util.*;

public class DuplicateLetters {
    public static void main(String[] args) {
        String str = " deeeveneedd";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        //iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //if the character is already in the map, increment its count
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            //else add the character to the map with count as 1
            else {
                map.put(ch, 1);
            }
            
        }
        
        //iterate through the map to print the characters with count more than 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate letter: " + entry.getKey());
            }
        }
    }
}

package NeetCode_150.Arrays_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC49GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        //create a map
        Map<String, List<String>> map = new HashMap<>();
        //loop through every words in this stringg
        for (String s : strs) {

            int[] count = new int[26];
            //here count letter in the words
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            //add # to make key diffrent from other
            for (int i : count) {
                sb.append("#");
                sb.append(i);
            }

            String key = sb.toString();
            //If this key doesn't exist, create a new list. Then add the current word to that list.
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
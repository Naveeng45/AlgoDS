**Problem Statement :**
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Examples
Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation: There are three groups of anagrams: "ate", "eat", "tea" form one group, "nat", "tan" form another group, and "bat" forms the last group.
Input: strs = [""]
Output: [[""]]

Explanation: There is one group of anagram which is an empty string.
Input: strs = ["a"]
Output: [["a"]]

Explanation: There is one group of anagram which contains a single character string "a".

**Approach:**
A straightforward approach to solve this problem is by categorizing each string by its character count or a sorted version of the string itself, using this as a key in a hashmap. Strings that are anagrams of each other will have the same key.

Algorithm
1. Initialize an empty hashmap. The key of the hashmap will be a string that uniquely identifies the groups of anagrams, and the value will be a list of strings belonging to that group.
2. Iterate through each string in the input array:
    1. Sort the string alphabetically or count the occurrences of each character to generate a key.
    2. Add the string to the list in the hashmap corresponding to the key.
3. Collect all the lists from the hashmap and return them.
```java
import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution.groupAnagrams(strs));
    }
}

```

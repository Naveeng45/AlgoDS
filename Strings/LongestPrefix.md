# Longest Common Prefix

**Difficulty:** Easy

## Description

Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".

## Examples

### Example 1:

- **Input:** `strs = ["flower","flow","flight"]`
- **Output:** `"fl"`

### Example 2:

- **Input:** `strs = ["dog","racecar","car"]`
- **Output:** `""`
- **Explanation:** There is no common prefix among the input strings.

## Constraints

- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- `strs[i]` consists of only lowercase English letters.

## Approach

The idea is to compare characters one by one from the beginning of each string. We can follow these steps:

1. If the array is empty, return an empty string.
2. Start with the first string in the array as the initial prefix.
3. Compare this prefix with the next string in the array, reducing the length of the prefix if necessary until it matches the start of each string or becomes an empty string.
4. Continue this process for each string in the array.
5. The prefix left after comparing with all strings is the longest common prefix.

## Java Solution

```java
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs1 = {"flower","flow","flight"};
        System.out.println("Example 1: " + solution.longestCommonPrefix(strs1));
        
        String[] strs2 = {"dog","racecar","car"};
        System.out.println("Example 2: " + solution.longestCommonPrefix(strs2));
    }
}

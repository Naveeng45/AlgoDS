***Problem Statement***
Given a string s, reverse each word in the string while keeping the word order unchanged.

***Examples***
Input: "Algorithm Ace"
Output: "mhtiroglA ecA"
Input: "Data Structures and Algorithms"
Output: "ataD serutcurtS dna smhtiroglA"

>Approach

The problem can be solved by following these steps:

1. Split the String: First, split the input string by spaces to get individual words.
2. Reverse Each Word: Then, for each word, reverse the characters.
3. Join the Words: Finally, join the reversed words back together into a single string with spaces between them.

```java
public class ReverseWords {

    public static String reverseWords(String s) {
        // Split the string into words
        String[] words = s.split(" ");
        
        // StringBuilder to hold the final result
        StringBuilder result = new StringBuilder();
        
        // Iterate through each word
        for (String word : words) {
            // Convert the word into a StringBuilder to reverse it
            StringBuilder sb = new StringBuilder(word);
            sb.reverse(); // Reverse the word
            
            // Append the reversed word to the result
            result.append(sb.toString()).append(" ");
        }
        
        // Remove the trailing space and return the result
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Data Structures and Algorithms";
        String output = reverseWords(input);
        System.out.println(output); // Output: "ataD serutcurtS dna smhtiroglA"
    }
}

```

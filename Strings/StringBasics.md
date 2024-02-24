### 1.Basic String Operations
> Initialization
```java
String str1 = "Hello";
String str2 = new String("World");
 
```
>Concatenation
```java
String str3 = str1 + " " + str2; // Using +
String str4 = str1.concat(" ").concat(str2); // Using concat()
```
>Length
```java
int length = str1.length();
```
### 2. Character Extraction
>charAt(): Accessing a character at a specific index.
```java
char ch = str1.charAt(1); // 'e'
```
>getChars(): Extracting multiple characters into a char array.
```java
char[] chars = new char[5];
str2.getChars(0, 5, chars, 0);
```
### 3. String Comparison
>equals(): Comparing two strings for content equality.
```java
boolean isEqual = str1.equals("Hello");
```
>equalsIgnoreCase(): Comparing two strings, ignoring case differences.
```java
boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello");
```
>compareTo(): Comparing two strings lexicographically.
```java
int diff = str1.compareTo(str2);
```
### 4.Searching and Modifying
>**indexOf() / lastIndexOf()**: Searching for a character or substring within a string.
```java
int index = str1.indexOf('l'); // First occurrence
int lastIndex = str1.lastIndexOf('l'); // Last occurrence
```
>**replace()**: Replacing characters or substrings.
```java
String replacedString = str1.replace('l', 'p');
```
>**substring()**: Extracting a substring.
```java
String sub = str1.substring(1, 3); // "el"
```
### 5. Case Conversion
>**toLowerCase() / toUpperCase()**: Converting to lower case or upper case.
```java
String lower = str1.toLowerCase();
String upper = str1.toUpperCase();
```
### 6. Trimming
>**trim()**: Removing whitespace from both ends of a string. (Note: As of Java 11, strip() is preferred as it is Unicode-aware.)
```java
String trimmed = str1.trim();
```
### 7. Mutable Strings
>For situations where strings need to be modified frequently, **StringBuilder** and **StringBuffer** offer more efficient alternatives to String.

**StringBuilder**: Used for mutable strings without synchronization (single-threaded environments).
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
```
**StringBuffer**: Similar to StringBuilder but synchronized for thread safety (multi-threaded environments).
```java
StringBuffer sbf = new StringBuffer("Hello");
sbf.append(" World");
```
#### Best Practices and Tips
Prefer **StringBuilder** over **StringBuffer** for single-threaded operations due to its higher performance.
Use String for constant strings, StringBuilder for strings that are modified often in a single-thread context, and StringBuffer in multi-thread contexts.
Be mindful of the String class's immutability; operations like concatenation can quickly become inefficient in loops due to the creation of many temporary objects.

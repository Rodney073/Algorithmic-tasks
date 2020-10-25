/*
Write a function which decides whether a text is palindrom(It's the same whether
        you read it forwards or backwards). E.g.: abba, rotator, stats.
        You might assume that the input string is not null, the length is greater than
        1 and less than one million. **Strive for the low memory complexity!**

        Example:
*/

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("alma")); //false
        System.out.println(isPalindrome("görög")); //true

    }

    private static boolean isPalindrome(String word) {
        int countDifferentChars = 0;

        for (int i = 0; i < word.length()/2 ; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                countDifferentChars++;
            }
        }
        if (countDifferentChars == 0) {
            return true;
        }
        else {
            return false;
        }

    }

}

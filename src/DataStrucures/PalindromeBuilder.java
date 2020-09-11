package DataStrucures;

import java.util.ArrayList;
import java.util.List;

public class PalindromeBuilder {

    public static void main(String... args) {

        System.out.println(palindromeBuilder("asdfg"));
    }

    public static String palindromeBuilder(String word) {

        String palindrome = word;
        List<Character> listOfChars = new ArrayList<>();

        for (char ch : word.toCharArray()) {
            listOfChars.add(ch);
        }

        for (int i = 1; i <= listOfChars.size(); i++) {
            palindrome = palindrome + listOfChars.get(listOfChars.size() - i);
        }
        return palindrome;
    }

}
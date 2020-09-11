package DataStrucures;

import java.util.Arrays;

public class Anagram {
    public static void main(String... args) {

        System.out.println(anagram("asdf", "fdsa"));
    }
    public static boolean anagram(String wordOne, String wordTwo) {

        if (wordOne.length() != wordTwo.length()) {
            return false;
        } else {
            char[] charArrayOne = wordOne.toCharArray();
            Arrays.sort(charArrayOne);
            char[] charArrayTwo = wordTwo.toCharArray();
            Arrays.sort(charArrayTwo);

            return Arrays.equals(charArrayOne, charArrayTwo);
        }
    }
}
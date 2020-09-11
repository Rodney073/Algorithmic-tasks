package DataStrucures;

import java.util.ArrayList;
import java.util.List;

public class PalindromeSearcher {

    public static void main(String... args) {

        System.out.println(palindromeBuilder("racecar"));

    }

    //Solution for odd cases
    public static List<String> palindromeBuilder(String word) {

        List<String> palindromeList = new ArrayList<>();

        for (int i = 1; i < word.length(); i++) {
            for (int j = 1; j <= Math.min(i, word.length() - 1 - i); j++) {
                if (word.charAt(i - j) == word.charAt(i + j)) {
                    palindromeList.add(word.substring(i - j, i + j + 1));
                } else
                    break;
            }
        }

        return palindromeList;
    }

}

     /*   "dog goat dad duck doodle never"	["og go", "g g", " dad ", "dad", "d d", "dood", "eve"]
        "apple"	[]
        "racecar"	["racecar", "aceca", "cec"]
        ""	[]*/
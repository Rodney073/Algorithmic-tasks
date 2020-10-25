package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.List;

public class isSubstring {

    public static void main(String[] args) {

        String wordOne = "almaspitepike";
        String wordTwo = "pike";
        String wordThree = "bz";
        String wordFour = "pite";
        String wordFive = "almaspitepike";
        String wordSix = "traktor";


        System.out.println(isSubstringMethod(wordOne, wordTwo));
        System.out.println(isSubstringMethod(wordOne, wordThree));
        System.out.println(isSubstringMethod(wordOne, wordFour));
        System.out.println(isSubstringMethod(wordOne, wordFive));
        System.out.println(isSubstringMethod(wordOne, wordSix));

        System.out.println();

        System.out.println(theOtherSolution(wordOne, wordTwo));
        System.out.println(theOtherSolution(wordOne, wordThree));
        System.out.println(theOtherSolution(wordOne, wordFour));
        System.out.println(theOtherSolution(wordOne, wordFive));
        System.out.println(theOtherSolution(wordOne, wordSix));
    }

    private static boolean isSubstringMethod(String wordOne, String wordTwo) {

        int counter = 0;
        List<Integer> listOfMatchIndexes = new ArrayList<>();

        for (int i = 0; i < wordOne.length(); i++) {
            if (wordTwo.charAt(0) != wordOne.charAt(i)) {
                counter++;
            } else {
                listOfMatchIndexes.add(i);
            }
        }

        if (counter == wordOne.length()) {
            return false;
        } else {

            for (int i = 0; i < listOfMatchIndexes.size(); i++) {
                counter = 0;
                for (int j = 0; j < Math.min (wordTwo.length(), wordOne.length()-listOfMatchIndexes.get(i)); j++) {
                    if (wordOne.charAt(listOfMatchIndexes.get(i) + j) == wordTwo.charAt(j)) {
                        counter++;
                    }
                }
                if (counter == wordTwo.length()) {
                    return true;

                }
            }
        }
        return false;
    }

    private static boolean theOtherSolution (String wordOne, String wordTwo){

            if(wordTwo.length() > wordOne.length()) {
                return false; // trivially false
            }
            for(int i = 0; i < wordOne.length() - wordTwo.length(); ++i) { // trickerry for not overrunning in word one
                boolean isGood = true;
                for(int j = 0; j < wordTwo.length(); ++j) {
                    if(wordOne.charAt(i + j) != wordTwo.charAt(j)) {
                        isGood = false;
                        break;
                    }
                }
                if(isGood) {
                    return true;
                }
            }
            return false;
    }

}

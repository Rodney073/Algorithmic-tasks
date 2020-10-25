/*
You have a long string that has some meaning on a real language. For example a
        whole novel in a single string.
        Write a function that counts the occurrence of each word inside the string and
        writes them to the output in the following format: `word: number of occurrences`
        You might assume that the input is not null and not empty. The order of the
        words on the output does not matter.
        The solution might be case insensitive, you don't have to differentiate
        between capital and non-capital letters.
        The punctuation marks and line endings are not part of the words!

        Example:
        //Output:
//boci:2
//tarka:1
//se:2
//füle:1
//farka:1
*/


import java.util.ArrayList;
import java.util.HashMap;

public class CountTheWords {

    public static void main(String[] args) {
        String boci = "Boci, boci tarka, se füle, se farka.";
        System.out.println(countTheWords(boci));
    }


    private static HashMap<String, Integer> countTheWords(String boci) {

        String replace1 = boci.toLowerCase();
        String replace2 = replace1.replace(".", "");
        String replace3 = replace2.replace(",", "");

        String[] listOfBoci = replace3.split(" ");

        HashMap<String, Integer> countWords = new HashMap<>();
        ArrayList<String> wordsOfString = new ArrayList<>();

        for (int i = 0; i < listOfBoci.length; i++) {
            wordsOfString.add(listOfBoci[i]);
            if (!countWords.containsKey(wordsOfString.get(i))) {
                countWords.put(wordsOfString.get(i), 1);
            }
            else {
                countWords.replace(wordsOfString.get(i), countWords.get(wordsOfString.get(i))+1);
            }
        }

/*        for (int i = 0; i < listOfBoci.length; i++) {
            wordsOfString.add(listOfBoci[i]);
            countWords.put(wordsOfString.get(i), countWords.getOrDefault(wordsOfString.get(i), 0) + 1);
        }*/

        return countWords;
    }
}
    

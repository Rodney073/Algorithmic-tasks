/*Unique Characters
        Create a function called uniqueCharacters that takes a string as an input and returns an array / list with the unique letters of the given string.

        Example case:

        uniqueCharacters("anagram");
        Should return:

        ["n", "g", "r", "m"]

        --------------------------------*/
package TasksFromJohnyka;


import java.util.ArrayList;
import java.util.List;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word = "iianagrampkktyhaacccc";
        //System.out.println(uniqueCharacters(word));
        System.out.println(uniqueCharacters2(word));
    }

    private static List uniqueCharacters2(String word) {

        List <Character> listOfUniqCharacters = new ArrayList<>();

        for (int i = 0; i <word.length() ; i++) {
            if (!listOfUniqCharacters.contains(word.charAt(i))) {
                listOfUniqCharacters.add(word.charAt(i));
            }
        }

        for (int i = 0; i < listOfUniqCharacters.size() ; i++) {
            int counter =0;
            for (int j = 0; j <word.length() ; j++) {
                if (listOfUniqCharacters.get(i).equals(word.charAt(j))) {
                    counter++;
                }
            }
            if (counter > 1) {
                listOfUniqCharacters.remove(i);
                i=-1;
            }

        }

        return listOfUniqCharacters;
    }



/*    private static List<Character> uniqueCharacters(String word) {

        List<Character> listOfChars = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            listOfChars.add(word.charAt(i));
        }

        for (int i = 0; i < listOfChars.size(); i++) {
            for (int j = i + 1; j < listOfChars.size(); j++) {
                if (listOfChars.get(i).equals(listOfChars.get(j))) {
                    Character notUniqChar = listOfChars.get(i);

                    for (int k = 0; k < listOfChars.size(); k++) {
                        if (listOfChars.get(k).equals(notUniqChar)) {
                            listOfChars.remove(k);
                            k=-1;
                        }
                    }
                    i = 0;
                    j = 0;

                }

            }

        }
        return listOfChars;

    }*/

}

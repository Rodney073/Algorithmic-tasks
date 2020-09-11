package CrackingTheCodingInterview;

public class ReplaceAllSpaces {

    public static void main(String... args) {

        String text = " Hello world! Hello world! ";
        System.out.println(reverseString(text));
    }

    public static String reverseString(String textToBeEdited) {

        return textToBeEdited.replace(" ", "%20");
    }
}
package CrackingTheCodingInterview;

public class ReverseString {


    public static void main(String... args) {
        String text = "Hello world!";

        System.out.println(reverseString(text));
    }

    public static String reverseString(String textToBeReversed) {

        String reservedText = "";

        for (int i = 0; i < textToBeReversed.length(); i++) {
            reservedText += textToBeReversed.charAt(textToBeReversed.length() - 1 - i);
        }
        return reservedText;
    }
}
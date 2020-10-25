public class CountWordsOfString {
    public static void main(String[] args) {
        String text = "Once upon a time there was a big dragon";
        System.out.println(numOfWords(text));
    }

    public static int numOfWords(String text) {
        String [] splittedString = text.split(" ");
        return splittedString.length;
    }
}

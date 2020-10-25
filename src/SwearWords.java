public class SwearWords {
    public static void main(String[] args) {
        String text = "Fucker boci boci fuck, tarka bloody hell";
        String[] swearWords = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
        System.out.println(removedWords(text, swearWords));
        //System.out.println(text);
    }


    private static String removedWords(String text, String[] swearWords) {
        int counter = 0;

        String newText1 = text.toLowerCase();

        for (int i = 0; i < swearWords.length; i++) {
            if (newText1.contains(swearWords[i])) {
                newText1 = newText1.replace(swearWords[i], "*");
                counter++;

            }
        }


        return counter + "\n" + newText1;
    }
}

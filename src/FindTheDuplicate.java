/*You have an array that contains strings. Every item in the array is
        unique except one which is present in the array exactly twice.
        Write a function which finds the string that is present twice in the array.
        You might assume that the input array is not null, the length is greater
        or equal to 2 and less than one million. **Strive for the low time complexity!***/

public class FindTheDuplicate {
    public static void main(String[] args) {
        String[] fruitBasket = new String[] { "apple", "banana", "coconut", "durian",
                "banana", "elderberry", "fig", "grapefruit" };
        System.out.println(findTheDuplicate(fruitBasket)); //should return banana
    }

    private static String findTheDuplicate(String[] fruitBasket) {
        String notUniq = "";
        for (String s : fruitBasket) {
            for (int j = 1; j < fruitBasket.length; j++) {
                if (s.equals(fruitBasket[j])) {
                    notUniq = s;
                    return notUniq;
                }
            }
        }
        return notUniq;
    }


   /* private static String findTheDuplicate(String[] fruitBasket) {
        String theDuplicateString = "";
        for (int i = 0; i < fruitBasket.length ; i++) {
            for (int j = i+1; j < fruitBasket.length; j++) {
                if (fruitBasket[i] == fruitBasket[j]) {
                    theDuplicateString = fruitBasket[i];
                    break;
                }
            }
        }
        return theDuplicateString;
    }*/


}

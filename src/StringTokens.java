
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTokens {
    public static void main(String[] args) {

        String s = "      It's Boci boci, tarka?";

        s = s.replaceAll("[\\W]|_", " ");
        s = s.replaceAll(" +", " ");

        List<String> listOfS =  new ArrayList<> (Arrays.asList(s.split(" ")));

        listOfS.removeAll(Arrays.asList("", null));

        System.out.println(listOfS.size());

        for (int i = 0; i < listOfS.size(); i++) {
            System.out.println(listOfS.get(i));
        }

    }
}

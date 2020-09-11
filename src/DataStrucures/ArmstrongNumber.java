package DataStrucures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String... args) {

        System.out.println(armstrongNumChecker(1634));

    }

    public static String armstrongNumChecker(int number) {

        List<Integer> list = new ArrayList();

        String numberToString = String.valueOf(number);
        for (int i = 0; i < numberToString.length(); i++) {
            list.add(Character.digit(numberToString.charAt(i), 10));
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += (int) Math.pow(list.get(i), list.size());
        }

        if (sum == number) {
            return sum + " is an Armstrong number.";
        } else
            return sum + " is not an Armstrong number.";


    }


}

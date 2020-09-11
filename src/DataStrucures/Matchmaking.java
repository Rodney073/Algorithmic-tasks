package DataStrucures;

import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {

    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff", "4", "5", "6", "7"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {

        ArrayList<String> joinedList = new ArrayList<String>();

        if (girls.size() == boys.size()) {

            for (int i = 0; i < girls.size(); i++) {
                joinedList.add(girls.get(i));
                joinedList.add(boys.get(i));
            }

        } else if (girls.size() > boys.size()) {
            for (int i = 0; i < boys.size(); i++) {
                joinedList.add(girls.get(i));
                joinedList.add(boys.get(i));
            }
            for (int i = boys.size(); i < girls.size(); i++) {
                joinedList.add(girls.get(i));
            }


        } else {
            for (int i = 0; i < girls.size(); i++) {
                joinedList.add(girls.get(i));
                joinedList.add(boys.get(i));
            }
            for (int i = girls.size(); i < boys.size(); i++) {
                joinedList.add(boys.get(i));
            }

        }

        return joinedList;

    }
}
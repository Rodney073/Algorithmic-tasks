package DataStrucures;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Milyen intervallumon belul generaljak random szamot? Kerlek add meg elobb a munumum erteket: ");
        int minimumNumber = input.nextInt();

        System.out.println("Most a mximumot: ");
        int maximumNumber = input.nextInt();

        Random rand = new Random();
        int theRandomNumber = rand.nextInt(maximumNumber - minimumNumber) + minimumNumber;

        int attempts = 3;
        System.out.println(" Szuper. Johetnek a tippek. Probalkozasok szama: " + attempts);
        int tip = input.nextInt();


        while (tip != theRandomNumber && attempts > 1) {
            if (theRandomNumber > tip) {
                attempts--;
                System.out.println("Nagyobb, probald ujra! Probalkozasok szama: " + attempts);
                tip = input.nextInt();

            } else if (theRandomNumber < tip) {
                attempts--;
                System.out.println("Kisebb, probald ujra!Probalkozasok szama: " + attempts);
                tip = input.nextInt();

            }
        }
        if (attempts == 1 && tip != theRandomNumber) {
            System.out.println("Whoops. Nincs tobb probalkozasi lehetoseged");
        } else {
            System.out.println("Bingo");
        }
    }


}

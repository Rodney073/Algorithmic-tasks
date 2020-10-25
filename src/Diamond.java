import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int input = scan.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 1; j <input-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = 0; i < input; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <input-1-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

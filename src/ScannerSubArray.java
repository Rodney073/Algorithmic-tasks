import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ScannerSubArray {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int[] arrayOfNum = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <n ; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(list);

        int[] arrayOfNum = list.stream().mapToInt(i->i).toArray();

        //int[] arrayOfNum = {1, -2, 4, -5, 1 };

        sumOfSubs(arrayOfNum);

    }

    private static void sumOfSubs (int[] arrayOfNum){
        int counter =0;
        for (int i = 0; i <arrayOfNum.length ; i++) {
            for (int j = i+1; j <=arrayOfNum.length ; j++) {
                int[] newArray = Arrays.copyOfRange(arrayOfNum, i, j);
                int sum = 0;
                for (int k = 0; k <newArray.length ; k++) {
                    sum+=newArray[k];
                }

                if (sum < 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

}

import java.util.Arrays;
import java.util.List;

public class SubArray {
    public static void main(String[] args) {
        //int n = 5;
        int[] arrayOfNum = {1, -2, 4, -5, 1 };

        numOfSubstrings(arrayOfNum);
        sumOfNegativeSubs(arrayOfNum);

    }

    private static void numOfSubstrings(int[] arrayOfNum) {

        for (int i = 0; i <arrayOfNum.length ; i++) {
            for (int j = i+1; j <=arrayOfNum.length ; j++) {
                int[] newArray = Arrays.copyOfRange(arrayOfNum, i, j);
                System.out.println(Arrays.toString(newArray));
            }
        }
    }

    private static void sumOfNegativeSubs (int[] arrayOfNum){
        int counter =0;
        for (int i = 0; i <arrayOfNum.length ; i++) {
            for (int j = i+1; j <=arrayOfNum.length ; j++) {
                int[] newArray = Arrays.copyOfRange(arrayOfNum, i, j);
                int sum = 0;
                for (int k = 0; k <newArray.length ; k++) {
                    sum+=newArray[k];
                }
                //System.out.println(sum);
                if (sum < 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

}

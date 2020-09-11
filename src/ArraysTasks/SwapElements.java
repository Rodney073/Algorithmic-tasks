// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`
package ArraysTasks;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};
        System.out.println(Arrays.deepToString( swapElements(orders)));

    }

    private static String[] swapElements(String[] orders) {
        String container = orders[0];
        orders[0]= orders[2];
        orders[2]=container;

        return orders;
    }
}

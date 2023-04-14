package Practice;

import java.util.Arrays;

public class copy {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 2, 2, 2, 3};
        System.out.println("Original array" +Arrays.toString(array));
        int[] n =Arrays.copyOf(array,4);
        System.out.println("New length array"+Arrays.toString(n));
    }
}

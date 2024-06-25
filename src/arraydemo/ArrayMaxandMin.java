package arraydemo;

import java.util.Arrays;

public class ArrayMaxandMin {
    public static void main(String[] args) {

        int[] array = {10,20,5,17,45,12};


        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Minimum of array = "+array[0]);
        int length1 = array.length;
        System.out.println("Maximum of array = "+array[length1-1]);

    }
}

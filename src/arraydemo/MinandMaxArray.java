package arraydemo;

import java.util.Arrays;

public class MinandMaxArray {

    public static void main(String[] args) {
        int[] ar = { 10,20,5,17,45,12};

        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        int length1 = ar.length;
        System.out.println(ar[length1-1]);
        System.out.println(ar[length1-2]);
    }
}



package StringAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestLargest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number = ");
        String input = scan.nextLine();

        int smallnum = smallestNum(input);
        int largenum = largestNum(input);

        System.out.println("Smallest number = " +smallnum);
        System.out.println("Largest number = " +largenum);
    }

    public static int smallestNum(String number){

        char[] digits = number.toCharArray();
        Arrays.sort(digits);
        return Integer.parseInt(new String(digits));
    }
    public static int largestNum(String number){

        char[] digits = number.toCharArray();
        Arrays.sort(digits);
        reverseArray(digits);
        return Integer.parseInt(new String(digits));
    }

    public static void reverseArray(char[] array){

        int start = 0;
        int end = array.length - 1;
        while (start<end){
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }


}

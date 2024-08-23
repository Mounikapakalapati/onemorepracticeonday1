package StringAssignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string = ");
        String input1 = scan.nextLine();
        System.out.println("Enter second string = ");
        String input2 = scan.nextLine();

        boolean output = isAnagram(input1,input2);
        System.out.println(output);

    }
    public static boolean isAnagram(String s1, String s2){

        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s","").toLowerCase();

         if (s1.length()!=s2.length()){
             return false;
         }

         char[] charArray1 = s1.toCharArray();
         char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

         return Arrays.equals(charArray1, charArray2);

    }
}

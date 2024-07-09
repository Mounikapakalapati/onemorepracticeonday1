package StringAssignments;

import java.util.Scanner;

public class MergeTwoStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string = ");
        String string1 = scan.nextLine();
        System.out.println("Enter second string = ");
        String string2 = scan.nextLine();

        String merge = mergeTwo(string1,string2);
        String result = eliminateDouble(merge);
        System.out.println(result);

    }

    public static String mergeTwo(String string1, String string2){

        return string1+string2;

    }
    public static String eliminateDouble(String input){

        char[] chars = new char[input.length()];
        int index =0;
        char lastchar = '\0';

        for (char c : input.toCharArray()){

            if (c != lastchar) {
                chars[index++] = c;
                lastchar =c;

            }
        }
        return new String(chars,0,index);
    }

}

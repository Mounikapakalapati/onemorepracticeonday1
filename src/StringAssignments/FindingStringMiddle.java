package StringAssignments;

import java.util.Scanner;

public class FindingStringMiddle {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data = ");
        String mainString = scan.nextLine();
        System.out.println("Enter sub data = ");
        String subString = scan.nextLine();

        boolean result = middleStr(mainString,subString);
        System.out.println(result);

    }
    public static boolean middleStr(String mainString , String subString){

           int index = mainString.indexOf(subString);
           if (index == -1){
               return false;
           }
           int left = index;
           int right = mainString.length()-(index+subString.length());
           return Math.abs(left-right)<=1;

    }

}

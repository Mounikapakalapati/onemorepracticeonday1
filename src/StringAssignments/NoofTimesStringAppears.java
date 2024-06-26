package StringAssignments;

import java.util.Scanner;

public class NoofTimesStringAppears {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data = ");
        String firstString = scan.nextLine();
        System.out.println("Enter substring = ");
        String subString = scan.nextLine();

        int count = tallyInstance(firstString,subString);
        System.out.println("Substring = "+subString);
        System.out.println("Apperars = "+count);

    }

    public static int tallyInstance(String firstString , String subString){

        int count = 0;
        int index = 0;
        while ( (index = firstString.indexOf(subString,index)) != -1){
            count++;
            index += subString.length();
        }
        return count;
    }
}

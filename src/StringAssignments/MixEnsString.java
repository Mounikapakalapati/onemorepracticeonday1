package StringAssignments;

import java.util.Scanner;

public class MixEnsString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string = ");
        String string = scan.nextLine();

        String result = mixEnd(string);
        System.out.println(result);


    }

    public static String mixEnd (String string){

        if (string.length() <2 ){
            return string;
        }
        char secondlast = string.charAt(string.length() - 2);
        char last = string.charAt(string.length() - 1);

        String swap = string.substring(0,string.length() - 2) +last + secondlast;
        return swap;


    }

}
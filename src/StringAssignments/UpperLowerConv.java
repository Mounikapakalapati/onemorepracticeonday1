package StringAssignments;

import java.util.Locale;
import java.util.Scanner;

public class UpperLowerConv {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data = ");
        String data = scan.nextLine();

        String convdata = upperLower(data);
        System.out.println(convdata);


    }

    public static String  upperLower(String str){

        char[] charArray = str.toCharArray();

        for ( int i = 0; i < charArray.length; i++) {

            char c = charArray[i];
            if (Character.isUpperCase(c)){
                charArray[i] = Character.toLowerCase(c);
        }else
            {
                charArray[i] = Character.toUpperCase(c);
            }



        }
        return new String(charArray);

    }






}

package StringAssignments;

import java.util.Scanner;

public class StringDuplicacy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string = ");
        String string1 = scan.nextLine();
        System.out.println("Enter second string = ");
        String string2 = scan.nextLine();

        String result = duplicacyPattern(string1,string2);
        System.out.println(result);

    }

    public static String duplicacyPattern(String string1 ,String string2){

        return string1 + string2 + string2 + string1;
        }



    }

